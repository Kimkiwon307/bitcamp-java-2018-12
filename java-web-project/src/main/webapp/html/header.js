//헤더 가져오기
(function () {
	var header = document.querySelector('.bit-main-header')
	var xhr = new XMLHttpRequest()
	xhr.onreadystatechange = function() {
		if (xhr.readyState != 4 || xhr.status != 200)
			return;
		header.innerHTML = xhr.responseText

		// body 태그 쪽에 헤더 로딩 완료 이벤트를 보낸다.
		var e = new Event('loaded.header');
		document.body.dispatchEvent(e);
	};
	xhr.open('GET', '/java-web-project/html/header.html', true)
	xhr.send()
})();

document.body.addEventListener('loaded.header', () => {
	document.querySelector('#logout-btn').addEventListener('click',(e) => {
		e.preventDefault();
		var xhr = new XMLHttpRequest()
		xhr.onreadystatechange = function() {
			if (xhr.readyState != 4 || xhr.status != 200)
				return;
			location.href = '/java-web-project/html/index.html';
		};
		xhr.open('GET', '/java-web-project/app/json/auth/logout', true)
		xhr.send()
	});	
});


(function() {
	document.querySelector('#logout-btn').addEventListener('click',(e) => {
		e.preventDefault();
		var xhr = new XMLHttpRequest()
		xhr.onreadystatechange = function() {
			if (xhr.readyState != 4 || xhr.status != 200)
				return;
			
			var data = JSON.parse(xhr.responseText);
			if(data.status == 'success'){
				document.querySelector('#bit-not-login-state').style.display = 'none';
				}else {
					document.querySelector('#bit-login-state').style.display = 'none';
				}
		};
		xhr.open('GET', '/java-web-project/app/json/auth/user', true)
		xhr.send()
	})();