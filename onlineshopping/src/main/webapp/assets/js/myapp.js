$(function() {
	// solving the active menu problem
	switch (window.menu) {
	case 'About Us':
		$('#about').addClass("nav-item active");
		break;

	case 'Contact Us':
		$('#contact').addClass("nav-item active");
		break;

	default:
		$('#home').addClass('nav-item active');
		break;
	}
});