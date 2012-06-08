<%@page import="com.test.remote.caller.RemoteCall"%>
<%@page import="com.jumbalakka.commons.spring.SpringContextUtils"%>
<html>
<body>
<%
	RemoteCall caller = SpringContextUtils.getBean( "remoteCaller", RemoteCall.class );
	
	out.println( caller.returnNameFromMethodCall1() + "<br/>");
	out.println( caller.returnNameFromMethodCall2() + "<br/>");
	out.println( caller.returnNameFromMethodCall3() + "<br/>");
%>
</body>
</html>
