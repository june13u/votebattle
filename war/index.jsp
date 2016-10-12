<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>投票バトル！ートップページ</title>
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
</head>
<body>

	<div data-role="page">
		<div data-role="header" class="ui-bar">
			<h2>投票バトル！</h2>
			<div class="ui-btn-left">
				<a href="/" rel="external" class="ui-btn">ホーム</a>
		    </div>
			<div class="ui-btn-right">
				<a href="/stage/new" rel="external" class="ui-btn">ステージ作成</a>
				<a href="/stage/show" rel="external" class="ui-btn">ステージ閲覧</a>
			</div>
		</div>
		<div role="main" class="ui-content">
			<!-- ここにコンテンツ内容を記述する -->
			
			<%
				String keyword = (String)request.getAttribute("keyword");
				for(int i = 0; i<10 ; i++) out.println(keyword);
			%>
		</div>
		<div data-role="footer">
			<!-- ここにフッター内容を記述する -->
			footer
		</div>
	</div>

</body>
</html>