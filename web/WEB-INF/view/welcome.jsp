<%--
  User: amanmahato
  Date: 7/29/17
  Time: 12:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<spring:url value="WEB-INF/resources/css/login.css" var="loginCSS" />
<spring:url value="WEB-INF/resources/js/login.js" var="loginCSS" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<html>
<head>
    <script src="WEB-INF/resources/js/login.js"></script>
    <link href="WEB-INF/resources/css/login.css" rel="stylesheet" type="text/css">
</head>
<body>
    <div class="login-page">
        <div class="form">

            <form action="test" class="register-form" modelAttribute="UserRegistrationDto">
                <input path="firstName" type="text" placeholder="First Name"/>
                <input path="lastName" type="text" placeholder="Last Name"/>
                <input path="userName" type="text" placeholder="User Name"/>
                <input path="password" type="password" placeholder="Password"/>
                <input path="email" type="text" placeholder="Email Address"/>
                <button type="submit" value="registerNewUser">create</button>
                <p class="message">Already registered? <a href="#">Sign In</a></p>
            </form>

            <form action="" class="login-form" modelAttribute="UserLoginDTO">
                <input type="text" placeholder="User Name"/>
                <input type="password" placeholder="password"/>
                <button>login</button>
                <p class="message">Not registered? <a href="#">Create an account</a></p>
            </form>

        </div>
    </div>

</body>
</html>
