
package views.html.resource3

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Option[Long],Form[scala.Tuple2[String, String]],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Option[Long], myForm: Form[(String, String)]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.52*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/form(id.map(id => routes.Resource3.update(id)).getOrElse(routes.Resource3.create()))/*5.86*/ {_display_(Seq[Any](format.raw/*5.88*/("""
  """),_display_(Seq[Any](/*6.4*/inputText(myForm("foo")))),format.raw/*6.28*/("""
  """),_display_(Seq[Any](/*7.4*/inputText(myForm("bar")))),format.raw/*7.28*/("""
  <input type="submit"/>
""")))})),format.raw/*9.2*/("""
"""))}
    }
    
    def render(id:Option[Long],myForm:Form[scala.Tuple2[String, String]]): play.api.templates.Html = apply(id,myForm)
    
    def f:((Option[Long],Form[scala.Tuple2[String, String]]) => play.api.templates.Html) = (id,myForm) => apply(id,myForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 23 11:10:24 EST 2013
                    SOURCE: /Users/jroper/tmp/scala-compilation-times/app/views/resource3/edit.scala.html
                    HASH: 11ba0b0fddd92fe8c8e26235cfa71f14fb389544
                    MATRIX: 555->1|698->51|726->70|762->72|854->156|893->158|931->162|976->186|1014->190|1059->214|1116->241
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|27->6|27->6|28->7|28->7|30->9
                    -- GENERATED --
                */
            