<%--
  Created by IntelliJ IDEA.
  User: dan
  Date: 18.12.16
  Time: 23:28
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
  <head>
    <title>dna2rna</title>
      <script src="http://code.jquery.com/jquery-latest.min.js"></script>
      <script>

          $(document).on("submit", "#mainForm", function (e) {

                  var $form = $(this);
                  $.post($form.attr("action"), $form.serialize(), function (response) {
                      $("#resultRNA").text("rna" + response);
                  } );

                  e.preventDefault();

              });

      </script>

  <body>
  Enter DNA chain (String may only contain 'a', 'g', 't', 'c' characters.)
 <form action="dnaServlet" method="post" id="mainForm">
      <input type="text" name="dnaChain">
      <input type="submit" id="getRNAButton" name="Get m-RNA"/>
</form>

  <div id = "resultRNA">  </div>

  </body>
</html>
