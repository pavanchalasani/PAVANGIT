package works.buddy.samples;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WorksWithHerokuServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        response.setStatus(404);
        PrintWriter writer = response.getWriter();
        writer.print("Sample Demo Page as part of Super League DevOps Sessions covering CI and CD activitiesSample Demo Page as part of Super League DevOps Sessions covering CI and CD activities including Nexus as artifactory tool, SonarQube for code quality");
        writer.close();
    }
}
