<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bank</title>
    </head>
    <body>
    <h1>
    										<%
    											String rU = request.getParameter("richUser");
    											if(rU == null){
    										%>
    										richest user
    										<%	} else {
    										%>
    										<%=rU%>
    										<%	}%> >
    			</h1>
		<form>
		
			<input type = "text">

			<button type = "submit" name = "button" value ="richestUser"> get </button>
            <br><br>
            <input type = "text" value = <%
											String sA = request.getParameter("totalSum");
											if(sA == null){
										%>
										"accounts sum"			
										<%	} else { 
										%>
										"<%=sA + ""%> "
										<%	}%> >
            <button type = "submit" name = "button" value = "sumAccs"> get </button>

		</form>
	</body>
</html>
