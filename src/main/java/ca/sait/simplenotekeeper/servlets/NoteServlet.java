package ca.sait.simplenotekeeper.servlets;
import ca.sait.simplenotekeeper.javabeans.Note;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class NoteServlet extends HttpServlet {

    private static final String noteFilePath = "/WEB-INF/note.txt";
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath(noteFilePath);
      
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));

        String title = br.readLine();
        String contents = br.readLine();

        Note note = new Note(title, contents);
        request.setAttribute("note", note);
            
        String query = request.getQueryString();
        
        if(query.contains("edit") && query != null) {    
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
        else {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String contents = request.getParameter("contents");
        
        String path = getServletContext().getRealPath(noteFilePath);
        
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)))) 
        {
            pw.println(title);
            pw.println(contents);
        }
        
        response.sendRedirect("note");
    }
}
