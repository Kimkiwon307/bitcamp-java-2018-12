<%@page import="java.util.UUID"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    <%!
 static class FileInfo{
      String filename;
      long filesize;
      String orginfilename;
    }
    %>
<%
request.setCharacterEncoding("UTF-8");
Collection<Part> parts = request.getParts();
int count = 0;
ArrayList<FileInfo> files = new ArrayList<>();

out.println("{");

for (Part part : parts) {
  if (part.getContentType() == null) {
    out.println(String.format("  %s\"%s\": \"%s\"",
        (count++ > 0 ? "," : ""),
        part.getName(),
        request.getParameter(part.getName())));
  } else {
    files.add(part);
    String filename = UUID.randomUUID().toString();
    String filepath = application.getRealPath(
        application.getContextPath()
         + "/upload"
         + filename);
    part.write(filepath);
    
    FileInfo fileInfo = new FileInfo();
    fileInfo.filename = filename;
    fileInfo.filesize = part.getSize();
    fileInfo.orginfilename = part.getSubmittedFileName();
  }
}

if (count++ > 0) {
  out.print("  ,");
}

out.println("\"files\": [");
int fileCount = 0;

for (Part part : files) {
  out.println(String.format("    %s{\"filename\": \"%s\", \"filesize\": \"%d\"}",
      (fileCount++ > 0 ? "," : ""),
      part.getSubmittedFileName(),
      part.getSize()));
}
out.println("  ]");
out.println("}");
%>      











