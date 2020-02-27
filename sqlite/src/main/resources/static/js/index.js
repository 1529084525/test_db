$("#register").click(function () {
    var name = $('#name').val();
    var pwd = $("#pwd").val();
    var reg = /^([a-zA-Z]|[0-9])(\w|\-)+@[a-zA-Z0-9]+\.([a-zA-Z]{2,4})$/;
    if(reg.test(name)) {
        if(pwd !== '') {
            $.ajax({
                url: '/checkName',
                type: 'post',
                data: {
                    name: name
                },
                success: function (data) {
                    if(data === 'ok') {
                        alert("此邮箱已存在")
                    }else{
                        $.ajax({
                            url: '/register',
                            type: 'post',
                            data: {
                                'name': name,
                                'pwd': pwd
                            },
                            success: function (data) {
                                if(data > 0) {
                                    alert("注册成功");
                                    location.href =  '/login';
                                }else{
                                    alert("注册失败");
                                }
                            }
                        })
                    }
                }
            })
        }else{
            alert("请输入密码！");
        }
    }else{
        alert("邮箱格式不正确");
    }

});