# Kadai-Final

[課題10](https://github.com/SUZUKI-Takayuki-0404/Kadai10th)の成果物をAWSにデプロイし動作確認する

## 実施事項

### 1.VPCの設定

- VPC/EC2は[チューリアル](https://github.com/raisetech-for-student/tutorial-aws-deploy-simple-java-app-to-ec2)を基に設定

- 画像でフロー紹介

### 2.EC2の設定

 - チュートリアル参照、画像でフロー紹介

 - 補足事項：Windows PC特記事項

   - pemファイルの権限変更時、chmodコマンドはLinux(Ubuntu使用)でないと使用不可。

   - pemファイルをLinux環境ディレクトリ（\\wsl$）に置かないと、chmodコマンドが有効にならない

 - セキュリティグループの設定

 - 接続確認

 - mysqlのインストール

### 3.RDSの設定

 - 設定内容は画像参照
　
 - セキュリティグループの設定

### 4.EC2からRDSへの接続確認

 - 接続確認

### 5.Spring BootアプリのEC2導入

 - resourceフォルダのpropertiesファイルの設定
　
 - javaのインストール
　
   - チュートリアル参照、画像でフロー紹介
　
 - gitのインストール
　
   - チュートリアル参照、画像でフロー紹介
　
 - GitHubからダウンロード
　
   - チュートリアル参照、画像でフロー紹介

 - sqlファイルをデータベースに登録
　　
   - 課題10で使用しているテーブルsqlフォルダ内に格納
　
 - Spring Bootの起動

   - チュートリアル参照

   - 画像でフロー紹介

 - ブラウザから接続確認

### 6.Elastic IPの設定

### 7.接続確認終了後の後始末

 - 全て停止させ削除

 
