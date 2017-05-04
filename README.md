# Java-learn
##Java<br>
------------
###Java 学习笔记
-----------------

虽然C++依旧写的很烂<br>
但是还是想要写写Java<br>
刚好也在学用Github<br>
就正好拿来做学习笔记好啦<br>
<br>
<br>
1.本地创建新文件夹后push：本地创建好文件夹，文件夹下建*.md文件
，可以git add 文件夹名字
，git commit -m "说明文字"
，git push
，就创建好了文件夹。<br><br>
2.本地上传时会出现git error: failed to push some refs to 'git@github.com:<br>
出现这个错误是因为远程库中有文件没有下载下来，需要先运行：<br>
git pull origin master<br>
然后远程文件同本地工程合并了，之后再本地库中添加新文件并提交<br>
git push -u origin master<br>
<br>
3.发现了一个问题，本地push后，Github上的库中可以显示commit，但是首页上不能正常显示contributions，<br>
即小绿块，解决方法为在git中重新设置 用户名 和 邮箱<br>
git config --global user.name [username]<br>
git config --global user.email [user email]<br>
补充：再设置用户名和用户邮箱时，git需要处在跟目录下，不能位于本地库路径中<br>
