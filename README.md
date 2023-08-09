
# Dockerのjavaサンプルコード

実行コマンド

```bash
docker build -t myjava:openjdk .
docker run -it --rm -v ${PWD}:/mnt myjava:openjdk javac Main.java
docker run -it --rm -v ${PWD}:/mnt myjava:openjdk java Main
```

もしくは

```bash
docker compose up -d
docker compose exec myjava javac Main.java
docker compose exec myjava java Main
docker compose down
```
