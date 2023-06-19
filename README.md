# Kadai-Final

[課題10](https://github.com/SUZUKI-Takayuki-0404/Kadai10th)の成果物をAWSにデプロイし動作確認する

## 1.VPCの設定

詳細は[チューリアル](https://github.com/raisetech-for-student/tutorial-aws-deploy-simple-java-app-to-ec2)参照

### 1.1.設定画面

  <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/1dca0eb7-e950-4c2e-bc76-133ac1c6a7f5" width="60%"> <br>
  <br>
  <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/f6487d3e-4932-4d72-8212-5060fe1970b0" width="60%"> <br>

## 2.EC2の設定

詳細は[チューリアル](https://github.com/raisetech-for-student/tutorial-aws-deploy-simple-java-app-to-ec2)参照

### 2.1.設定画面

   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/0fa6a077-ae67-43c9-b9ce-67581e54d8be" width="60%"> <br>
   <br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/98243f79-96da-49f5-81fa-38989211b1e5" width="60%"> <br>
   <br>
   VPC設定で作成したものを追加<br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/4e0ae913-4739-40e4-9d14-fa5ac3f40264" width="60%"> <br>

### 2.2.セキュリティグループの設定

   セキュリティグループの設定で、任意の場所とMYSQL/Aurora追加<br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/21a0ccaf-1228-42b6-88bd-47a53d897bcb" width="60%"> <br>
   <br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/cc1bce21-a7c0-4689-b4e5-ac022b824349" width="60%"> <br>
   <br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/6bca8896-3afe-452c-b09f-1196f7ca8569" width="60%"> <br>

### 2.3.接続確認

   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/0c7a5014-bfe4-45aa-b784-21797ff0f783" width="60%"> <br>
 
### 2.4.AWS CLIのインストール

   以降のコマンドライン作業をUbuntu（Linux）で実施
  
   - pemファイルの権限変更時、chmodコマンドはLinuxでないと使用不可（Windows PowerShellはNG）

   - 注意事項：pemファイルはLinux環境ディレクトリ（\\\wsl$）に置かないと、chmodコマンドの効果が無い

     <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/25f7ce7a-ed68-4619-a3a6-ca19ae6a6ab5" width="80%">

   - Ubuntuにunzipを事前インストールのうえ、[AWS CLI](https://docs.aws.amazon.com/ja_jp/cli/latest/userguide/cli-chap-getting-started.html) Linux用をUbuntuにインストール
     ```
     sudo apt-get install zip unzip
     ```

### 2.5.pemファイルを使いSSH接続

   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/78a7ee1c-4573-4009-9dda-55e38ddc9788" width="60%"> <br>

### 2.6.Mysqlのインストール

   ```
   sudo yum install mysql
   ```
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/3e6438f4-c5a8-4546-acb2-ac2fb8178fe6" width="60%"> <br>
   <br>EC2アクセス終了
   ```
   exit
   ```

## 3.RDSの設定

### 3.1.設定画面
 
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/6d26e9c6-926a-46fb-88db-8f2be731cc28" width="60%"> <br>
   <br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/552c5664-fef7-4133-af14-fc53bde8562b" width="60%"> <br>
   <br>データーベースのユーザー名/パスワードを設定<br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/30215213-71d0-4d64-af5d-6bc80ab54d2d" width="60%"> <br>
   <br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/822be25e-2261-45f5-b6ec-be2ca4e152a2" width="60%"> <br>
   <br>VPC設定で作成したものを追加<br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/4f1af245-7127-4e75-b751-c741aebc53e4" width="60%"> <br>
   <br>ポート番号はセキュリティ設定と同じ3306<br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/2e479568-2880-4882-bdd2-6188389acf9f" width="60%"> <br>
   <br>データベース名を設定<br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/90a81ba4-616b-46b4-ba86-36fea027b401" width="60%"> <br>
   <br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/877c10ed-38cb-472f-be10-5e62440155ae" width="60%"> <br>
   <br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/2c3edd6b-f9ec-464a-8bc8-1932d9eb6cb1" width="60%"> <br>

### 3.2.セキュリティグループの設定

   EC2設定時にあわせて設定したものを追加<br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/f5363c90-aeff-4f0a-8527-06a6297b0fa4" width="60%"> <br>

## 4.EC2からRDSへの接続確認

### 4.1.接続確認

   EC2接続後にmysqlにアクセス（以下コマンド入力後にパスワード入力）
   ```
   mysql -h データベースのアクセスポイント -P ポート番号 -u user –p
   ```
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/2d59ec40-1c51-4e45-98d1-727ce85bf957" width="60%"> <br>
   <br>データベースを確認（まだ空の状態）
   ```
   show databases;
   use データベース名;
   show tables;
   ```
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/24318be4-ae9c-4810-8f77-46c615e59eab" width="60%"> <br>
   <br>データベースへのアクセス終了
   ```
   quit
   ```

## 5.Spring BootアプリのEC2導入

### 5.1.application.propertiesの設定

   RDSのアクセスポイント、ポート番号、データベース名、ユーザー名/パスワードを設定<br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/6b00e16e-dfa9-4540-a995-ed3f79b576e7" width="60%"> <br>

### 5.2.javaのインストール
　
   詳細は[チューリアル](https://github.com/raisetech-for-student/tutorial-aws-deploy-simple-java-app-to-ec2)参照

   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/0c09b577-a2eb-4a61-bf91-7ad453619c0f" width="60%"> <br>

### 5.3.gitのインストール

   詳細は[チューリアル](https://github.com/raisetech-for-student/tutorial-aws-deploy-simple-java-app-to-ec2)参照

   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/d106491c-42c0-48d1-99ab-baf91f4f0104" width="60%"> <br>
　
### 5.4.GitHubからアプリケーションのダウンロード
　
   詳細は[チューリアル](https://github.com/raisetech-for-student/tutorial-aws-deploy-simple-java-app-to-ec2)参照

   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/06ef7840-bf42-4de2-a623-00afc2c7c571" width="60%"> <br>
   <br>やり直しの為ディレクトリ削除する場合
   ```
   rm -r ディレクトリ名
   ```

### 5.5.sqlファイルをデータベースに登録

   - [課題10](https://github.com/SUZUKI-Takayuki-0404/Kadai10th)のテーブル（Dockerに読み込ませたもの）はsqlフォルダ内に格納
   
   - RDSのデータベースにアクセスして登録
     ```
     SOURCE テーブルのファイル名.sql
     ```
     <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/e177b76f-b78d-4f26-ae29-7cb401711cbe" width="60%"> <br>
     <br>登録できているかを確認後、データベースへのアクセスを終了する
     ```
     show tables;
     select * from テーブル名
     ```
     <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/098afe24-534b-4f21-b041-4b18a442d9a8" width="60%"> <br>
     <br>
     <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/a6e4e27f-a017-4ae4-b4ce-288020bb23a5" width="60%"> <br>

### 5.6.Spring Bootの起動

   詳細は[チューリアル](https://github.com/raisetech-for-student/tutorial-aws-deploy-simple-java-app-to-ec2)参照

   gradlewに実行権限を付与してbootRun実行
   ```
   chmod +x ./gradlew
   ./gradlew bootRun
   ```
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/d279748c-37ad-4757-86ee-4d19a8000369" width="60%"> <br>

### 5.7.ブラウザから接続確認

   httpリクエストに対するレスポンス例<br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/43192d77-f268-40a9-969e-d540594ddb89" width="60%"> <br>
   <br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/433a7e3e-a149-4cd0-b8b6-740c51708a76" width="60%"> <br>
   <br>（参考）RDSでテストメソッド実行<br>
   <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/4322451d-6e9d-4ad8-b022-ef18abd9ad85" width="60%"> <br>

## 6.Elastic IPの設定

### 6.1.設定画面

<img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/3da11567-51c0-4f95-8896-2dadf58f53fa" width="60%"> <br>
<br>
<img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/bc98300e-03b7-4792-a5d5-0792a16c8bb0" width="60%"> <br>
<br>
<img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/ae08d76d-5106-43bc-9de8-49bcedab628c" width="60%"> <br>

### 6.2.Elastic IPをEC2に関連付け

<img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/458def9e-2150-4fdf-846e-341c315c9d28" width="60%"> <br>
<br>
<img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/04752997-7867-4b82-9318-4ec2c144f707" width="60%"> <br>
<br>
<img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/0d92f5ea-7f93-4f57-b97e-a09018eedcb2" width="60%"> <br>

### 6.2.Elastic IP経由でEC2にアクセスし動作確認

ブラウザからElastic IPアドレスを使用しアクセス<br>
<img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/99452cca-8bfb-48de-8753-95d12f2a03cb" width="60%"> <br>

## 7.接続確認終了後の後始末

### 7.1.Elastic IPの関連付け解除と解放

- Elastic IPとEC2の関連付けを解除
  
  <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/369b78ec-cb09-4882-8646-cb25109b9968" width="60%"> <br>
  
- Elastic IPの削除
  
  <img src="https://github.com/SUZUKI-Takayuki-0404/Kadai-Final/assets/113277395/91f49f23-62ef-4213-8063-8b820db3c9c7" width="60%"> <br>

### 7.2.EC2/RDSの停止
### 7.3.EC2/RDSの削除

以 上
