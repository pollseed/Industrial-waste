koto project
====
[![Gitter](https://badges.gitter.im/Join Chat.svg)](https://gitter.im/pollseed/koto?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
* J) kotoは、日本古典楽器「箏曲」の事を表現しています。
* E) koto represented Japan classical instrument "Koto" thing.

## 概要
* JavaのUtilクラスを中心に使えそうなものをまとめます。
* 最終的にはmavenにでもして使えるようにすることを想定しています。

## kotoのディレクトリ構成

### 共通化部分

```
src/jp.com.koto
```

### 定数

```
constant
```
呼び出す時にルールをインタフェースで定義してあり、定数を作る時はそちらを実装する形を作法とします。

### ルール

```
role
```
例えば、RFC2396などを置いています。

ここでは、主にそういったルールを呼び出すものですので、定数に近いとは言えます。

とはいえ、定数がごった返してしまうことを懸念して新たにルールパッケージを切っています。

* TODO) RFC2396に関しては、定数が中に埋め込まれているので、別途定数パッケージに入れておきたい。

### 機能

```
util
```
このパッケージ配下では、主にプログラミングをしていて、既存のライブラリでまかなえなさそうなことを書いています。

ですが、使う場面が多いとはいえないので、もっと拡張する必要があるでしょう。

DateUtils.javaでは、普段良く使う日付の処理をまとめた。ただ、基本ライブラリで作成することが目的のためJodatimeでやりたい人は全く必要ないだろう。

## 環境
* jdk v1.7.0_51
