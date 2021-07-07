<html>

<head>
    <meta charset="utf-8">
    <title>freemarker+bootstrap学习</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- 新 Bootstrap4 核心 CSS 文件 -->
    <link rel="stylesheet"
          href="https://cdn.staticfile.org/twitter-bootstrap/4.1.0/css/bootstrap.min.css">

</head>
<body>
<div class="container-fluid">

    <div class="row clearfix">
        <div class="col-md-16 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th >id</th>
                    <th >大类</th>
                    <th >子类</th>
					<th>服务码</th>
					<th >服务名称</th>
					<th class="col-md-1 column">场景码</th>
					<th >场景名称</th>
					<th>交易码</th>
					<th>交易名称</th>
					<th>服务调用方</th>
					<th>服务提供方</th>
					<th>服务状态</th>
                    <th>备注</th>
                </tr>
                </thead>
                <tbody>

                <#list overviewList as overview>
                    <tr>
                        <td>${overview.id}</td>
                        <td>${overview.bigCategory}</td>
                        <td>${overview.subCategory}</td>
                        <td>${overview.svcCode}</td>
                        <td>${overview.svcName}</td>
                        <td>${overview.sceneCode}</td>
						<td>${overview.sceneName}</td>
						<td>${overview.tradeCode}</td>
						<td>${overview.tradeName}</td>
						<td>${overview.consumer}</td>
						<td>${overview.provider}</td>
						<td>${overview.status}</td>
						<td>${overview.remarks}</td>
                    </tr>
                </#list>
                </tbody>
            </table>
        </div>

        <#--分页-->

    </div>
</div>
</body>

</html>