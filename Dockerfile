# # ベースイメージとして公式のTomcatイメージを使用
# FROM tomcat:10.1.7-jdk17-temurin

# # 必要に応じて、アプリケーションをTomcatのwebappsディレクトリにコピー
# # COPY ./book.war /usr/local/tomcat/webapps/

# # ポートの公開
# EXPOSE 8080

# # Tomcatを起動
# CMD ["catalina.sh", "run"]
# ベースイメージとして公式のTomcatイメージを使用
FROM tomcat:10.1.7-jdk17-temurin

# your-app.warをTomcatのwebappsディレクトリにコピー
COPY ./book.war /usr/local/tomcat/webapps/


# ポートの公開
EXPOSE 8080

# Tomcatを起動
CMD ["catalina.sh", "run"]