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
