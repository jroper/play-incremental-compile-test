
package views.html.resource1

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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Seq[Long],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(ids: Seq[Long]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.18*/("""

<ul>
"""),_display_(Seq[Any](/*4.2*/for(id <- ids) yield /*4.16*/ {_display_(Seq[Any](format.raw/*4.18*/("""
<li><a href=""""),_display_(Seq[Any](/*5.15*/routes/*5.21*/.Resource1.get(id))),format.raw/*5.39*/("""">"""),_display_(Seq[Any](/*5.42*/id)),format.raw/*5.44*/("""</a></li>
""")))})),format.raw/*6.2*/("""
</ul>

<a href=""""),_display_(Seq[Any](/*9.11*/routes/*9.17*/.Resource1.create())),format.raw/*9.36*/("""">Create</a>
"""))}
    }
    
    def render(ids:Seq[Long]): play.api.templates.Html = apply(ids)
    
    def f:((Seq[Long]) => play.api.templates.Html) = (ids) => apply(ids)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 23 11:10:23 EST 2013
                    SOURCE: /Users/jroper/tmp/scala-compilation-times/app/views/resource1/index.scala.html
                    HASH: 2de2567642435657b002f55f6775a0d9374d7883
                    MATRIX: 518->1|611->17|653->25|682->39|721->41|771->56|785->62|824->80|862->83|885->85|926->96|979->114|993->120|1033->139
                    LINES: 19->1|22->1|25->4|25->4|25->4|26->5|26->5|26->5|26->5|26->5|27->6|30->9|30->9|30->9
                    -- GENERATED --
                */
            