

import java.io.*;

public class even_odd_site {
    public static void main(String[] args) throws IOException {
        BufferedWriter file = new BufferedWriter(new FileWriter("numbers.html"));
        file.read("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n");
        file.write("<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n");
        // For loop that writes to a table in Java
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                file.write("<tr><td>" + i + "</td><td></td></tr>\n");
            }
            else {
                file.write("<tr><td></td><td>" + i + "</td></tr>\n");
            }
        }
        file.write("</table>\n</body>\n</html>");
        file.open();
        BufferedReader reader = new BufferedReader(new FileReader("numbers123.html"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
