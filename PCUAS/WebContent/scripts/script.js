var schools = [
	{
		name: "De La Salle University",
		description: "0Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
	},{
		name: "University of Santo Thomas",
		description: "1Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
	},{
		name: "University of the Philippines",
		description: "2Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
	},{
		name: "Ateneo",
		description: "3Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
	},{
		name: "Far Eastern University",
		description: "4Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
	}
];


$(document).ready(function(){
	$('.about-carousel').slick({
		autoplay: true,
		dots: true
	});


	$('.inline-list.schools').slick({
		infinite: true,
		slidesToShow: 3,
		centerMode: true,
		autoplay: true,
		autoplaySpeed: 3000
	});

	$("#menu-button").click(function(){
		/*if($("#side-container").width() == 0){
			$("#side-container").animate({width: "23%"}, "slow");
			$("#mainscreen").animate({width: "77%"}, "slow");
		}else{
			$("#side-container").animate({width: "0"}, "slow");
			$("#mainscreen").animate({width: "100%"}, "slow");
		}*/
		console.log($('#menu-container').css('left'));
		if($('#menu-container').css('left') == '0px'){
			$('#menu-container').animate({left:'350px'}, "slow");
			$('#main-container').animate({left:'350px'}, "slow");
		}else{
			$('#menu-container').animate({left:'0px'}, "slow");
			$('#main-container').animate({left:'0px'}, "slow");
		}
		

	});

});

