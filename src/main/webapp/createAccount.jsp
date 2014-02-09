<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Create New Customer Account</title>
<meta name="description" content="Default Description" />
<link href="css/styles.css" rel="stylesheet" type="text/css"></link>
<script type="text/javascript" src="js/script.js"></script>
</head>

<body>
	<div class="pagebody">
		<div class="page-title">
			<h1>Create an Account</h1>
		</div>
		<form id="form-validate" method="post"
			action="createAccount" onsubmit="return verifyAndSubmit();">
			<div style="width:90%">
				<fieldset>
					<legend>Personal Information</legend>
					<div style="width:100%">
						<div style="width:49%;float:left;">
							<div style="width:45%; "> <label> First Name <em>*</em> </label></div>
							<div style="width:50%"><input type="text" name="fname" id="fname"/></div>
						</div>
						<div style="width:49%; float:left;">
							<div style="width:45%; "> <label> Last Name <em>*</em> </label></div>
							<div style="width:50%"><input type="text" name="lname" id="lname"/></div>
						</div>
					</div>
					<div style="width:100%">
						<div style="width:100%;float:left;">
							<div style="width:45%; "> <label> Email Address <em>*</em> </label></div>
							<div style="width:50%"><input type="text" name="email" id="email"/></div>
						</div>
					</div>
					<div style="width:100% float:left;">
						<input type="checkbox" name="newsletter" id="newsletter"></input>
						<label style="width: 100px">Sign up for newsletter</label><br />
					</div>			
				</fieldset>
			</div>
			<div style="width: 90%">
				<fieldset>
					<legend>Login Information</legend>
					<div style="width:100%">
						<div style="width:49%;float:left;">
							<div style="width:45%; "> <label> Password <em>*</em> </label></div>
							<div style="width:50%"><input type="password" name="password" id="password"/></div>
						</div>
						<div style="width:49%; float:left;">
							<div style="width:45%; "> <label> Confirm Password <em>*</em> </label></div>
							<div style="width:50%"><input type="password" name="confirmPassword" id="confirmPassword"/></div>
						</div>
					</div>
				</fieldset>
			</div>
			<div>&nbsp;</div>
			<div id="errMessage" style="color:red;"></div>
			<div id="successMessage" ></div>
			
			
			<div style="width:100%;text-align:center;">
			<input type="submit" value="Submit"></input>
			</div>
			<div>&nbsp;</div>
		</form>
		
	</div>
</body>
</html>