register.jsp<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>HTML5 Login Form with validation Example</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">

</head>
<body>
<!-- partial:index.partial.html -->
<div class="background-img">
<div id="login-form-wrap">
  <h2>Login</h2>
  <form id="login-form" action="/lms/loginServlet" method="get">
    <p>
    <input type="text" id="username" name="username" placeholder="username" required><i class="validation"><span></span><span></span></i>
    </p>
    <p>
    <input type="password" id="password" name="password" placeholder="password" required><i class="validation"><span></span><span></span></i>
    </p>
    <p>
    <input type="submit" id="login" value="Login">
    </p>
    <span id="error">${error}</span>
  </form>
  <div id="create-account-wrap">
    <p>Not a member? <a href="#">Create Account</a><p>
  </div><!--create-account-wrap-->
</div><!--login-form-wrap-->
<!-- partial -->
</div>
  
</body>
</html>
