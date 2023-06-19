# Kadai-Final

[課題10](https://github.com/SUZUKI-Takayuki-0404/Kadai10th)の成果物をAWSにデプロイし動作確認する

## 実施事項

### 1.VPCの設定

- 詳細は[チューリアル](https://github.com/raisetech-for-student/tutorial-aws-deploy-simple-java-app-to-ec2)参照

- 設定画面

  <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/1dca0eb7-e950-4c2e-bc76-133ac1c6a7f5" width="60%"> <br>
  <br>
  <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/f6487d3e-4932-4d72-8212-5060fe1970b0" width="60%"> <br>

### 2.EC2の設定

 - 詳細は[チューリアル](https://github.com/raisetech-for-student/tutorial-aws-deploy-simple-java-app-to-ec2)参照

 - 設定画面

   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/0fa6a077-ae67-43c9-b9ce-67581e54d8be" width="60%"> <br>
   <br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/98243f79-96da-49f5-81fa-38989211b1e5" width="60%"> <br>
   <br>
   VPC設定で作成したものを追加<br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/4e0ae913-4739-40e4-9d14-fa5ac3f40264" width="60%"> <br>

 - セキュリティグループの設定

   セキュリティグループの設定で、任意の場所とMYSQL/Aurora追加<br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/21a0ccaf-1228-42b6-88bd-47a53d897bcb" width="60%"> <br>
   <br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/cc1bce21-a7c0-4689-b4e5-ac022b824349" width="60%"> <br>
   <br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/6bca8896-3afe-452c-b09f-1196f7ca8569" width="60%"> <br>

 - 接続確認

   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/0c7a5014-bfe4-45aa-b784-21797ff0f783" width="60%"> <br>
 
 - AWS CLIのインストール

   以降のコマンドライン作業をUbuntu（Linux）で実施
  
   - pemファイルの権限変更時、chmodコマンドはLinuxでないと使用不可（Windows PowerShellはNG）

   - 注意事項：pemファイルはLinux環境ディレクトリ（\\\wsl$）に置かないと、chmodコマンドの効果が無い

     <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/25f7ce7a-ed68-4619-a3a6-ca19ae6a6ab5" width="60%">

   - Ubuntuにunzipを事前インストールのうえ、[AWS CLI](https://docs.aws.amazon.com/ja_jp/cli/latest/userguide/cli-chap-getting-started.html) Linux用をUbuntuにインストール
     ```
     sudo apt-get install zip unzip
     ```

 - pemファイルを使いSSH接続

   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/78a7ee1c-4573-4009-9dda-55e38ddc9788" width="60%"> <br>

 - mysqlのインストール

   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/3e6438f4-c5a8-4546-acb2-ac2fb8178fe6" width="60%"> <br>

### 3.RDSの設定

 - 設定画面
 
<img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/6d26e9c6-926a-46fb-88db-8f2be731cc28" width="60%"> <br>
<br>
<img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/552c5664-fef7-4133-af14-fc53bde8562b" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
![21_データベースの作成3_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/30215213-71d0-4d64-af5d-6bc80ab54d2d)
![21_データベースの作成4](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/822be25e-2261-45f5-b6ec-be2ca4e152a2)
![21_データベースの作成5_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/4f1af245-7127-4e75-b751-c741aebc53e4)
![21_データベースの作成6r1_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/2e479568-2880-4882-bdd2-6188389acf9f)
![21_データベースの作成7_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/90a81ba4-616b-46b4-ba86-36fea027b401)
![21_データベースの作成8_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/877c10ed-38cb-472f-be10-5e62440155ae)
![21_データベースの作成9_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/2c3edd6b-f9ec-464a-8bc8-1932d9eb6cb1)

 - セキュリティグループの設定
![22_RDSのセキュリティグループ設定_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/f5363c90-aeff-4f0a-8527-06a6297b0fa4)

### 4.EC2からRDSへの接続確認

 - 接続確認
![33_EC2からRDSへのmysql接続確認1_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/2d59ec40-1c51-4e45-98d1-727ce85bf957)
![33_EC2からRDSへのmysql接続確認2_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/24318be4-ae9c-4810-8f77-46c615e59eab)

### 5.Spring BootアプリのEC2導入

 - resourceフォルダのpropertiesファイルの設定
　![41_application propertiesの設定r1_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/6b00e16e-dfa9-4540-a995-ed3f79b576e7)

 - javaのインストール
　
   - 詳細は[チューリアル](https://github.com/raisetech-for-student/tutorial-aws-deploy-simple-java-app-to-ec2)参照

   - 画像でフロー紹介
　![42_javaのインストール_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/0c09b577-a2eb-4a61-bf91-7ad453619c0f)

 - gitのインストール

   - 詳細は[チューリアル](https://github.com/raisetech-for-student/tutorial-aws-deploy-simple-java-app-to-ec2)参照

   - 画像でフロー紹介
　![43_gitのインストールr1_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/d106491c-42c0-48d1-99ab-baf91f4f0104)
　
 - GitHubからダウンロード
　
   - 詳細は[チューリアル](https://github.com/raisetech-for-student/tutorial-aws-deploy-simple-java-app-to-ec2)参照

   - 画像でフロー紹介
![43_Repositoryからclone_r1_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/06ef7840-bf42-4de2-a623-00afc2c7c571)

 - sqlファイルをデータベースに登録
　　
   - 課題10で使用しているテーブルsqlフォルダ内に格納
![44_RDSにsqlファイル読み込み_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/e177b76f-b78d-4f26-ae29-7cb401711cbe)

![44_RDSにsqlファイル読み込み2_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/098afe24-534b-4f21-b041-4b18a442d9a8)

![44_RDSにsqlファイル読み込み3_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/a6e4e27f-a017-4ae4-b4ce-288020bb23a5)

 - Spring Bootの起動

   - 詳細は[チューリアル](https://github.com/raisetech-for-student/tutorial-aws-deploy-simple-java-app-to-ec2)参照

   - 画像でフロー紹介
![45_bootRunの実行r2_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/d279748c-37ad-4757-86ee-4d19a8000369)

 - ブラウザから接続確認
![47_ブラウザにパブリックIPアドレス入力してアクセス結果_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/43192d77-f268-40a9-969e-d540594ddb89)
![47_ブラウザにパブリックIPアドレス入力してアクセス結果2_ok](https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/433a7e3e-a149-4cd0-b8b6-740c51708a76)

### 6.Elastic IPの設定

### 7.接続確認終了後の後始末

 - 全て停止させ削除

 
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
<br>
<img src="" width="60%"> <br>
