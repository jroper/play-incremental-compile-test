
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
object item extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,scala.Tuple2[String, String],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, data: (String, String)):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.36*/("""

<dl>
    <dt>Foo</dt>
    <dd>$data._1</dd>
    <dt>Bar</dt>
    <dd>$data._2</dd>
</dl>

<a href=""""),_display_(Seq[Any](/*10.11*/routes/*10.17*/.Resource1.edit(id))),format.raw/*10.36*/("""">Edit</a>
<a href=""""),_display_(Seq[Any](/*11.11*/routes/*11.17*/.Resource1.delete(id))),format.raw/*11.38*/("""">Delete</a>
"""))}
    }
    
    def render(id:Long,data:scala.Tuple2[String, String]): play.api.templates.Html = apply(id,data)
    
    def f:((Long,scala.Tuple2[String, String]) => play.api.templates.Html) = (id,data) => apply(id,data)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 23 11:10:23 EST 2013
                    SOURCE: /Users/jroper/tmp/scala-compilation-times/app/views/resource1/item.scala.html
                    HASH: c980545a086d1dd7d7053007fc7f16eb3bf27211
                    MATRIX: 541->1|652->35|790->137|805->143|846->162|903->183|918->189|961->210
                    LINES: 19->1|22->1|31->10|31->10|31->10|32->11|32->11|32->11
                    -- GENERATED --
                */
            