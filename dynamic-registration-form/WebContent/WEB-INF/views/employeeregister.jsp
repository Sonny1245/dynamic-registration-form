
<!doctype html>
<html lang="en-US">
<head>
	<meta charset="UTF-8" />
	<meta name="description" content="CA DMV Style Guide Example for Log In" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>Log In | DMV Style Guide</title>

	<link href="https://cdn.uat.dmv.ca.gov/dmv-design-system/dev/styleguide/dist/css/style.css" rel="stylesheet" />
</head>
<body class="bg--blue-light-5">

	<a href="#main" class="sr-text">Skip to main content</a>
	<header role="banner" class="bg--blue-gradient pr-10 pl-20 pt-12 pb-12 bp-md:p-20 shadow--lg pos--relative elevation--10">
		<div class="container container--lg flex flex--nowrap flex--align-center">

			<a href="https://www.ca.gov/" class="branding shadow--none mr-12 bp-md:mr-24">
				<img src="https://cdn.uat.dmv.ca.gov/dmv-design-system/dev/images/logo-ca-gov.svg" alt="California State Logo" class="show" width="47" height="35" class="logo--ca" />
				<span class="visually-hidden">State of California</span>
			</a>

			<a href="https://www.dmv.ca.gov/portal/" class="branding shadow--none">
				<img src="https://cdn.uat.dmv.ca.gov/dmv-design-system/dev/images/logo-ca-dmv-white.svg" alt="California State Department of Motor Vehicles Logo" class="show logo--dmv" />
				<div class="visually-hidden">State of California Department of Motor Vehicles</div>
			</a>

			<nav class="flex--col-right pos--relative">
				<button data-toggle="nav-menu" class="btn btn--icon btn--icon-light p-5 pos--relative">
					<div class="bg--yellow p-5 border-radius--full pos--absolute pos--top pos--left mt-5">
						<span class="visually-hidden">You are currently signed into this application.</span>
					</div>
					<span class="visually-hidden">Menu</span>
					<svg aria-hidden="true" class="icon icon--mdlg mr-5 text--blue-dark-2">
						<use xlink:href="#icon-person-circle"></use>
					</svg>
					<svg aria-hidden="true" class="icon icon--xsm icon--toggle">
						<use xlink:href="#icon-caret-down"></use>
					</svg>
				</button>
				<ul aria-label="User submenu." class="dropdown list--clean p-16 m-0 text--xxxxsm" id="nav-menu">
					<li class="dropdown__item mb-20">
						<div>Welcome,</div> <strong class="text--xxxsm">FirstName LastName</strong>
					</li>
					<li class="dropdown__item mb-16">
						<a href="#?edit-profile" class="link--white text--xxsm"><strong>Edit Profile</strong></a>
					</li>
					<li class="dropdown__item">
						<a href="#?logout" class="link--white text--xxsm"><strong>Logout</strong></a>
					</li>
				</ul>
			</nav>
		</div><!--/.container-->

	</header>

	<main role="main">
		<div class="hero bg--blue pr-16 pl-16 pt-0">
			<img class="hero__bg" src="https://cdn.uat.dmv.ca.gov/dmv-design-system/dev/images/bg--hero.png" alt="Illustration of Nortern California" />
			<div class="container container--lg pos--relative flex flex--align-center mh--110">
				<h1 class="text--white m-0 pt-24 pb-24">Registration Form</h1>
				
			</div>
		</div>
		<div class="pr-16 pb-16 pl-16 pos--relative">
			<div class="container container--lg p-20 bp-md:p-30 bp-md:pr-60 bp-md:pl-60 bp-md:pt-40 bp-md:pb-60 mb-20 bg--white border-radius--lg">
				<div class="container container--lg pr-20 pl-20 pt-60 bp-md:pr-60 bp-md:pl-60 bp-md:pb-60 mb-20 bg--white border-radius--lg-bottom">
	<!--Required -->
	<div class="w--100 bp-md:flex bp-md:flex--align-center mb-60 bp-md:mb-40">
		<div class="border--middle m-0 flex--grow-1 flex--shrink-1 w--auto mb-0 hide bp-lg:show"></div>
		<div class="flex--grow-0 flex--shrink-0 w--auto text--tighten flex--col-right mb-0 mt-0 text--xxxsm bp-md:text--xxsm text--h6 bg--white pos--relative elevation--10 bp-md:pt-0 bp-md:pl-30 text--right">
			Required Fields <span class="text--orange-dark-2 text--sm">*</span>
		</div>
	</div>
	<!-- Page Heading -->
	<h2 class="text--h3 m-0 flex--grow-1 flex--shrink-1 w--auto mb-24">
		Registration Form Online Services
	</h2>
	<p class="text--xmd">Not registered? In order to log in, you will first need to <a href="" class="text--700">create an account</a>.</p>
	<!-- Page Body -->
	<form 
		action="<%= request.getContextPath()%>/" 
		class="mb-24 mt-72 bp-md:flex" 
		method="post"
	>
		<fieldset>
			<div class="mb-24 w-100 bp-md:max-width--250">
				<label for="fname">
					First Name: <span aria-label="required" class="text--orange-dark-2 text--xsm">*</span>
				</label>
				<input 
					type="text" 
					id="fname"
					name="firstName"
					placeholder="Enter your first name" 
				/>
			</div>
			<div class="mb-24 w-100 bp-md:max-width--250">
				<label for="lname">
					Last Name: <span aria-label="required" class="text--orange-dark-2 text--xsm">*</span>
				</label>
				<input 
					type="text" 
					id="lname"
					name="lastName"
					placeholder="Enter your last name" 
				/>
			</div>
			<div class="mb-24 w-100 bp-md:max-width--250">
				<label for="user_name">
					User Name: <span aria-label="required" class="text--orange-dark-2 text--xsm">*</span>
				</label>
				<input 
					type="text" 
					id="user_name"
					name="userName"
					placeholder="Enter your user name" 
				/>
			</div>
			<div class="mb-0 w-100 bp-md:max-width--250">
				<label for="password">
					Password: <span aria-label="required" class="text--orange-dark-2 text--xsm">*</span>
				</label>
				<input 
					type="password"
					id="password"
					name="password"
					pattern="[a-zA-Z0-9!#$%]*"
					placeholder="Enter your password"
				/>
				<div class="mb-24 w-100 bp-md:max-width--250">
				<label for="addr">
					Address: <span aria-label="required" class="text--orange-dark-2 text--xsm">*</span>
				</label>
				<input 
					type="text" 
					id="addr"
					name="address"
					placeholder="Enter your address" 
				/>
			</div>
			<div class="mb-24 w-100 bp-md:max-width--250">
				<label for="contactNo">
					Contact No: <span aria-label="required" class="text--orange-dark-2 text--xsm">*</span>
				</label>
				<input 
					type="text" 
					id="contactNo"
					name="contact"
					placeholder="Enter your contact number" 
				/>
			</div>
				<p class="w-100 bp-md:mt-16 mt-10 text--xsm">
					<a href="" class="w--100 bp-md:mt-16 mt-10 text--xsm text--700">Forgot your password?</a>
				</p>
			</div>
		</fieldset>
		<!-- CTA Buttons -->
		<div class="mt-5 pt-3 bp-md:mt-5 bp-md:pt-5 mb-5 pb-8 flex flex--col flex--align-center flex--jusify-center bp-md:flex--row bp-md:flex--justify-start w--100">
			<button type="submit" class="pr-60 pl-60 mb-20 bp-md:mb-0">Submit</button>
		</div>
		<!-- Note (primary) -->
		<div class="flex flex--col flex--nowrap bp-md:flex--row mb-40 text--xmd max-width:800 text--blue-dark-2">
			<div class="mb-8 bp-md:mb-0">
				<div class="show--inline-block bg--yellow text--xxsm text--uppercase pl-10 pr-10 border-radius--sm mr-10">
					<strong>Note</strong>
				</div>
			</div>
			<div>
				As of February 22, 2020, DMV upgraded online customer account system. If you created an online account with DMV proior to the date above, you must <a href="" class="text--700">register for a new account</a>. 
			</div>
		</div>
		<p class="text--xmd text--blue-dark-2 bp-md:w--800 mb-40">
			Forgot your email or no longer have access to the email account you used to create the account? You must <a href="" class="text--700">register for a new account</a>.
		</p>
		<div class="text--md text--900 w--100 mb-24">Additional Information</div>
		<div class="flex flex--col">
			<p class="mb-8">
				<a href="" class="text--700">Privacy and Security</a>
			</p>
			<p class="mb-8">
				<a href="" class="text--700">Technical Support</a>
			</p>
		</div>
	</form>
</div>
<!-- Need Help -->
<div class="flex flex--align-center text--blue pt-10 flex--justify-center bp-md:flex--justify-start">
	<a href="#!?help" class="mr-5">
		<strong>Need Help</strong>
	</a>
	<svg aria-hidden="true" class="icon icon--xsm">
		<use xlink:href="#icon-help"></use>
	</svg>
</div>

			</div>
		</div>
	</main>

	<footer class="container container--lg pl-16 pr-16" role="contentinfo">
		<div class="border--top pt-30 pb-20 bp-md:pt-40 bp-md:pb-30">
			<nav class="flex flex--col-reverse bp-md:flex--align-center bp-md:flex--justify-between bp-md:flex--row">

				<ul class="mb-20 bp-lg:mb-0 mr-0 ml-0 mt-20 bp-md:mt-0 bp-md:flex list--clean p-0">
					<li class="bp-md:flex mr-40 mb-10">Copyright &copy; 2020 State of California</li>
					<li class="bp-md:flex mr-40 mb-10"><a href="#!" class="link--blue">Privacy &amp; Security</a></li>
					<li class="bp-md:flex mr-40 mb-10"><a href="#!" class="link--blue">Conditions of Use</a></li>
					<li class="mr-40 mb-10"><a href="#!" class="link--blue">Sitemap</a></li>
				</ul>

				<ul class="flex flex--justify-between bp-md:flex--justify-between list--clean m-0 p-0">
					<li class="bp-md:mr-40">
						<a href="#!" class="text--blue shadow--none">
							<span class="visually-hidden">Facebook</span>
							<svg aria-hidden="true" class="icon icon--xlg">
								<use xlink:href="#icon-facebook"></use>
							</svg>
						</a>
					</li>
					<li class="bp-md:mr-40">
						<a href="#!" class="text--blue shadow--none">
							<span class="visually-hidden">Twitter</span>
							<svg aria-hidden="true" class="icon icon--xlg">
								<use xlink:href="#icon-twitter"></use>
							</svg>
						</a>
					</li>
					<li class="bp-md:mr-40">
						<a href="#!" class="text--blue shadow--none">
							<span class="visually-hidden">YouTube</span>
							<svg aria-hidden="true" class="icon icon--xlg">
								<use xlink:href="#icon-youtube"></use>
							</svg>
						</a>
					</li>
					<li class="bp-md:mr-40">
						<a href="#!" class="text--blue shadow--none">
							<span class="visually-hidden">Instagram</span>
							<svg aria-hidden="true" class="icon icon--xlg">
								<use xlink:href="#icon-instagram"></use>
							</svg>
						</a>
					</li>
					<li>
						<a href="#!" class="text--blue shadow--none">
							<span class="visually-hidden">LinkedIn</span>
							<svg aria-hidden="true" class="icon icon--xlg">
								<use xlink:href="#icon-linkedin"></use>
							</svg>
						</a>
					</li>
				</ul>

			</nav>
		</div>
	</footer>

	<script src="https://cdn.uat.dmv.ca.gov/dmv-design-system/dev/styleguide/dist/js/script.js"></script>

</body>
</html>
