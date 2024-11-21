# Tomcatの公式イメージを使用
FROM tomcat:10.1.7-jdk17-temurin

# アプリケーションWARファイルをTomcatのwebappsディレクトリにコピー
COPY ./book.war /usr/local/tomcat/webapps/

# H2データベースのJARファイルをTomcatのlibディレクトリにコピー
COPY ./lib/h2-2.1.214.jar /usr/local/tomcat/lib/

# 永続データ保存用のディレクトリを作成
RUN mkdir -p /usr/local/data

# JNDIリソースを設定するためのcontext.xmlをコピー
COPY ./context.xml /usr/local/tomcat/conf/

# ポートを公開
EXPOSE 8080

# Tomcatを起動
CMD ["catalina.sh", "run"]
