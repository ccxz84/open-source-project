[![Issues][issues-shield]][issues-url]
[![Pulls][pulls-shield]][pulls-url]
[![MIT License][license-shield]][license-url]

# 오픈소스기반고급설계 프로젝트[군머니티]


## Team Name(미정)

## Project Name(Gunmunity)
최근 국방부에서 병사 휴대폰 허용 제도를 실시함에 따라 군 병사들은 군 부대 내에서 스마트폰을 이용하는 시간이 많아졌다.
그러나 실질적으로 병사들에게 군 복무와 관련해서 도움을 줄 수 있는 어플리케이션은 많이 없다. 이에 장병 복지 향상을 위한  “군 장병 어플리케이션”을 제안한다.
해당 프로젝트에서는 장병간의 커뮤니티 기능을 제공하여 해당 소속부대만이 아니라 다른 부대들과도 소통할 수 있는 기회를 제공한다.
추가적으로 기존 급여 계산과 차별화된 급여 계산기 기능과 일반병사 뿐만 아니라 간부들에 대한 전역일 계산기 기능을 제공함으로써
모든 장병들이 스마트폰을 이용하여 부대 생활에 적응할 수 있도록 도와주고 장병의 복지가 향상되기를 기대할 수 있다.

## Meeting Log(예정)

- [2020/04/02](https://docs.google.com/document/d/1Moi6urQKCPAq2nINftOKGP1mnsTuGXnn7usDXQ9kegM/edit)

## Etc

- [API문서]()
- [Report Bug](https://github.com/chlalstjd430/open-source-project/issues/new?template=bug_report.md)
- [Requesst Feautre](https://github.com/chlalstjd430/open-source-project/issues/new?template=future_request.md)


<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About The Project](#about-the-project)
    * [Build With](#build-with)
* [Client Architecture](#client-architecture)
* [Contributing](#contributing)
    * [Git Flow Plugin](#git-flow-plugin)
* [License](#license)
* [Contact](#contact)

## About The Project

To get a local copy up and running follow these simple steps.

### Build With

## Client Architecture

클라이언트는 다음과 같은 기술 스택을 사용했습니다.

### Presentation Architecture - MVVM

- View : UI와 관련된 데이터를 시각적으로 보여주는 역할을 합니다. 또, 사용자의 이벤트를 입력받습니다.
- ViewModel : UI와 관련된 데이터를 가공합니다. 또 Model로부터 데이터를 가져와서 View에 보여주기 위한 작업을 합니다.
- Model : Remote Db와 Local Db를 가지고 있습니다. 데이터를 저장하고 뷰모델에 보내주는 작업을 합니다.

### Retrofit2

네트워크 통신을 하기 위해 Retrofit2를 사용합니다. 비동기 처리 방식을 사용했습니다.

### Room

Local Db를 구성하기 위해 Room Library를 사용했습니다.

### Lottie

효과적인 Animation 처리를 위해 Lottie Library를 사용했습니다.

### Java

개발 언어로 Java를 사용했습니다.

<!-- CONTRIBUTING -->
## Contributing

기본적으로 [GitFlow](https://danielkummer.github.io/git-flow-cheatsheet/index.ko_KR.html) 방식으로 프로젝트를 진행한다.

1. Fork the Project
2. Create your Feature Branch by dev branch (`git checkout -b feature/myFeature dev`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Git Flow Plugin
- [Intellij](https://plugins.jetbrains.com/plugin/7315-git-flow-integration)


<!-- LICENSE -->
## License

```
MIT License

Copyright (c) 2020 서지원 최민성 최창익

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```



<!-- CONTACT -->
## Contact

- 최민성 - cms3136@gmail.com
- 최창익 - aackddlr@gmail.com
- 서지원 - ccxz84@naver.com

Project Link: [프로젝트명 입력 예정](https://github.com/chlalstjd430/open-source-project)


<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[issues-shield]: https://img.shields.io/github/issues/chlalstjd430/open-source-project
[issues-url]: https://github.com/chlalstjd430/open-source-project
[pulls-shield]: https://img.shields.io/github/issues-pr/chlalstjd430/open-source-project
[pulls-url]: https://github.com/chlalstjd430/open-source-project/pulls
[license-shield]: https://img.shields.io/github/license/chlalstjd430/open-source-project
[license-url]: https://github.com/chlalstjd430/open-source-project/blob/master/LICENSE.txt