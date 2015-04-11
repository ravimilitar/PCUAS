var appliedSchools = [{
	name: 'De La Salle University - Manila',
	address: '2401 Taft Avenue, Malate, Metro Manila Philippines 1004',
	isApplied: true
}
,{
	name: 'University of the Philippines - Manila',
	address: 'Padre Faura Street, Ermita, Metro Manila Philippines',
	isApplied: false	
}
,{
	name: 'Adamson University - Manila',
	address: '900 San Marcelino Street, Ermita, Metro Manila Philippines',
	isApplied: false
}];

$(document).ready(function(){
	
	try{
		$('.courses-container').slick({
			arrows: false
		});	

		$('.select-number-container li, .select-college-container li').click(function(){
			$('.courses-container').slick('slickNext');
		});

		$('.white-button').click(function(){
			$('.courses-container').slick('slickPrev');
		});

		$('.select-course-container li').click(function(){
			$('.courses-container').slick('slickGoTo', '0');
		});
	}catch(err){}

});

function displaySearchResults(){
	for (var i =  0; i < appliedSchools.length; i++) {
		
		if(appliedSchools[i].isApplied){
			$('#search-results-container').append(
				"<div class='search-item-container applied'>"
					+"<label class='search-title'>"+appliedSchools[i].name+"</label>"
					+"<label class='applied-container'>Applied!</label><br>"
					+"<label class='search-description'>"+appliedSchools[i].address+"</label>"
				+"</div>")	
		}else{
			$('#search-results-container').append(
				"<a href='addschool2.jsp'><div class='search-item-container'>"
					+"<label class='search-title'>"+appliedSchools[i].name+"</label><br>"
					+"<label class='search-description'>"+appliedSchools[i].address+"</label>"
				+"</div></a>")	
		}

	}

}