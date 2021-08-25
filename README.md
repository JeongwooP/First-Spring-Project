# SpartaCodingClubSpring
Spring을 학습하며 만든 개인 프로젝트입니다. 2개 있습니다.

1. 익명 타임라인 서비스
공유하고 싶은 소식을 입력하는 공간이다. 24시간이 지난 뒤에는 내용이 사라진다. 메모를 새로 적고 내용을 수정 할 수도 있다. CRUD 기능을 가진 Memo 웹페이지를 만들었다.

첫 페이지다.
![20210825_004506_1](https://user-images.githubusercontent.com/20348923/130808642-82bc4fbf-6125-42c2-84de-3352fd1d2998.png)

원하는 글을 쓰고 전송 이미지를 누르면 타임라인에 저장된다.
![20210825_004506_2](https://user-images.githubusercontent.com/20348923/130808650-3d31cbdd-9b72-4e44-b1a2-6e3a91aac88e.png)
![20210825_004506_3](https://user-images.githubusercontent.com/20348923/130808652-5d59d6d1-3c52-4030-bd75-69d4d74bdd12.png)

원하는 글을 수정할 수 있다.
![20210825_004506_4](https://user-images.githubusercontent.com/20348923/130808656-a4126f05-c04a-4997-a28b-80942d7ff83f.png)
![20210825_004506_5](https://user-images.githubusercontent.com/20348923/130808659-e3aeffde-e93c-4edf-b426-432bdf6aaa17.png)
![20210825_004506_6](https://user-images.githubusercontent.com/20348923/130808661-6d7fc206-7785-4bc5-b77d-41a986572fed.png)
![20210825_004506_7](https://user-images.githubusercontent.com/20348923/130808663-d8835564-3b8f-4388-a192-03c5897d3264.png)

추가로 작성시 아래에 붙어서 나온다.
![20210825_004506_8](https://user-images.githubusercontent.com/20348923/130808666-2fbb794a-53fd-41a4-9671-4d3b43f8a149.png)
![20210825_004506_9](https://user-images.githubusercontent.com/20348923/130808669-67b70baa-79f7-4634-a5bb-918b38aff834.png)

글을 삭제하는 기능도 있다.
![20210825_004506_10](https://user-images.githubusercontent.com/20348923/130808670-0266380d-99e9-457c-857a-2e2a89f85b39.png)
![20210825_004506_11](https://user-images.githubusercontent.com/20348923/130808672-db0ed72d-5637-4fad-9030-36af1bb0e50f.png)
![20210825_004506_12](https://user-images.githubusercontent.com/20348923/130808673-990f9b18-de06-4948-a9aa-7485429c25ac.png)

---
2. 나만의 설렉샵
네이버 검색 API를 이용해서 최저가인 상품을 찾는다. 그리고 사용자가 설정한 가격보다 최저가가 낮을 때 "최저가" 표시를 표기한다. 이는 모아보기 칸에서 나오고 탐색하기 칸에서 원하는 상품을 검색할 수 있다. 상품을 누르면 탭 창으로 실제 네이버 데이터로 이동한다.

* AWS의 EC2에 서버를 돌리게 했고 AWS의 RDS 데이터베이스 중 MySQL로 DB를 사용하기도 했다. Filezilla와 Git으로 인스턴스를 연결해 파일을 보내고 작동시켰다. 가비아에서 도메인을 구입해 웹 사이트의 도메인 주소를 지정하기도 했다.


탐색하기를 눌러 원하는 제품을 네이버 쇼핑 API를 통해 최저가로 결과를 뿌려준다. 
![20210825_232227_1](https://user-images.githubusercontent.com/20348923/130808676-21b423f8-2337-4077-a6d9-3b1adc11e293.png)
![20210825_232227_2](https://user-images.githubusercontent.com/20348923/130808680-e0ea3a37-e154-4c9f-97c0-28eb9562931c.png)

항목 저장을 누르면 원하는 최저가를 입력할 수 있다.
![20210825_232227_3](https://user-images.githubusercontent.com/20348923/130808684-099136d3-dde4-413e-9feb-592501ced886.png)
![20210825_232227_4](https://user-images.githubusercontent.com/20348923/130808686-e1c921ba-35ad-41f0-950e-77b10acb3834.png)

사용자가 지정한 가격보다 낮으면 최저가라고 라벨이 붙는다.
![20210825_232227_5](https://user-images.githubusercontent.com/20348923/130808690-f4bf379d-9277-4730-89cc-709dbd29e4de.png)

상품 이미지를 누르면 네이버 쇼핑으로 링크가 연결된다.
![20210825_232227_6](https://user-images.githubusercontent.com/20348923/130808692-fb2fbdca-e5e2-4815-93b5-73948888c14d.png)

나이키를 입력해 다른 제품을 저장했다.
![20210825_232227_6_1](https://user-images.githubusercontent.com/20348923/130808696-33bf3c1e-2819-4d8a-b58e-407449f50ebb.png)

현재 최저가보다 더 낮은 가격으로 입력시 최저가 라벨이 붙지 않는다.
![20210825_232227_7](https://user-images.githubusercontent.com/20348923/130808699-9e1febbf-3b21-408a-b6da-ecd4194608c4.png)
![20210825_232227_8](https://user-images.githubusercontent.com/20348923/130808702-b565bccd-150d-4440-b484-6a3837031960.png)
![20210825_232227_9](https://user-images.githubusercontent.com/20348923/130808705-d334d1a1-67e7-4cc5-b9d1-22be6d239087.png)
