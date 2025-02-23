
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author jvaja
 */
public class Interst extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          
            double amount = Double.parseDouble(request.getParameter("amount"));
            double rate = Double.parseDouble(request.getParameter("rate"));
            double year = Double.parseDouble(request.getParameter("year"));
            double months = Double.parseDouble(request.getParameter("months"));
            String calculateInterest = request.getParameter("calculateinterest");
            if(amount >= 1000000)
            {
                out.println("Enter Amount less than 1000000");
              
            }
            else{
            double interest = 0.0;
            double n=0.0;
            double p=0.0;
            switch (calculateInterest)
            {
                case "daily":
                n = 365;
                p = 1 + (rate / 100) / 365;
                break;
               
                case "daily360":
                n = 360;
                p = 1 + (rate / 100) / 360;
                break;
               
                case "semiweekly":
                n = 104;
                p = 1 + (rate / 100) / 26;
                break;
               
                case "weekly":
                n = 52;
                p = 1 + (rate / 100) / 52;
                break;
               
                case "biweekly":
                n = 26;
                p = 1 + (rate / 100) / 26;
                break;
               
                case "halfmonthly":
                 n = 24;
                 p = 1 + (rate / 100) / 6;
                 break;
                 
                case "monthly":
                n = 12;
                p = 1 + (rate / 100) / 12;
                break;
               
                case "bimonthly":
                n = 6;
                p = 1 + (rate / 100) / 6;
                break;
               
                case "quarterly":
                n = 4;
                p = 1 + (rate / 100) / 4;
                break;
               
                case "halfyearly":
                n = 2;
                p = 1 + (rate / 100) / 2;
                break;
               
                case "yearly":
                n = 1;
                p = 1 + (rate / 100);
                break;
                 
            }
            double t = year + months / 12;
            interest = amount * Math.pow(p, n * t);
          out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Result</title>");
        out.println("<style>"
        //            + "body {font-family: Arial, sans-serif;}"
                    + "table {border-collapse: collapse; width: 50%;border-radius:5px; margin-top:100px;}"
                    + "th, td {border: 2px groove gray; text-align: left; padding: 8px;}"
                    + "th {background-color: red;}"
                    + "</style>");
        out.println("</head>");
        out.println("<body>");

        out.println("<center><h2>Compound Interest Result</h2></center><hr>");
        out.println("<center><table>");
        //out.println("<tr><th>Parameter</th><th>Value</th></tr>");
        out.println("<tr><td>Principal Amount:</td><td>₹" + amount + "</td></tr>");
        out.println("<tr><td>Interest Rate:</td><td>" + rate + "%</td></tr>");
        out.println("<tr><td>Years:</td><td>" + (int)year + "</td></tr>");
        out.println("<tr><td>Months:</td><td>" + (int)months + "</td></tr>");
        out.println("<tr><td>Compound Interval:</td><td>" + calculateInterest + "</td></tr>");
        out.println("<tr><td>Calculated Amount:</td><td>₹" + String.format("%.2f", interest) + "</td></tr>");
        out.println("</table></center>");

        out.println("</body>");
        out.println("</html>");

            }

        }
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
