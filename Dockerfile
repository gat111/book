# Tomcatの公式ベースイメージを使用
FROM tomcat:10.1.7-jdk17-temurin

# アプリケーションのWARファイルをTomcatのwebappsディレクトリにコピー
COPY ./your-app.war /usr/local/tomcat/webapps/

# 永続データ保存用ディレクトリを作成
RUN mkdir -p /usr/local/data

# H2データベースのJARをコピー
COPY ./lib/h2-2.1.214.jar /usr/local/tomcat/lib/

# JNDIリソースを設定するためのcontext.xmlをコピー
COPY ./context.xml /usr/local/tomcat/conf/

# 必要に応じて静的ファイルをデプロイ
COPY ./test.html /usr/local/tomcat/webapps/ROOT/

# ポートを公開
EXPOSE 8080

# Tomcatを起動
CMD ["catalina.sh", "run"]
