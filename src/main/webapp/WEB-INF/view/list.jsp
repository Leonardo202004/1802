<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/js/jquery-1.8.2.min.js"></script>
<link href="/resources/css/css.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="/resources/js/bootstrap.min.js"></script>
</head>
<body>
<form action="list.do">
电影名称：<input type="text" name="name" value="${moiveVO.name }">
电影导演：<input type="text" name="actor" value="${moiveVO.actor }">
电影年代：<input type="text" name="years" value="${moiveVO.years }">
上映时间：<input type="text" name="d1" value="${moiveVO.d1 }">-<input type="text" name="d2" value="${moiveVO.d2 }">
时长：<input type="text" name="t1" value="${moiveVO.t1 }">-<input type="text" name="t2" value="${moiveVO.t2 }">
价格：<input type="text" name="p1" value="${moiveVO.p1 }">-<input type="text" name="p2" value="${moiveVO.p2 }">
<input type="submit" value="查询">
<table>
	
		<tr>
		<td>
			<input type="button" value="全选" onclick="ck(1)">
			<input type="button" value="反选" onclick="ck(2)">
			<input type="button" value="全不选" onclick="ck(3)">
		</td>
			<td>电影名称</td>
			<td>导演</td>
			<td>票价</td>
			<td>上映时间</td>
			<td>时长</td>
			<td>类型</td>
			<td>年代</td>
			<td>区域</td>
			<td>状态</td>
		</tr>
		<c:forEach items="${info.list}" var="movie">
			<tr>
				<td><input type="checkbox" class="ck" value="${movie.id }"></td>
				<td>${movie.name }</td>
				<td>${movie.actor }</td>
				<td>${movie.price}</td>
				<td>${movie.uptime }</td>
				<td>${movie.longtime }</td>
				<td>${movie.type }</td>
				<td>${movie.years }</td>
				<td>${movie.area }</td>
				<td>${movie.status }</td>
			</tr>
		</c:forEach>
       <tr> 
        <td colspan="10"> <jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include>  </td>
       </tr>
	</table>
</form>
</body>
<script type="text/javascript">

function goPage(pageNum){
	location="/list.do?pageNum="+pageNum;
}
function ck(falg){
	if (falg == 1) {
		$(".ck").attr("checked",true);
	}else if (falg == 2){
		$(".ck").each(function(){
			this.checked=!this.checked;
		})
	}else{
		$(".ck").attr("checked",false);
	}
}

</script>
</body>
</html>