
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Task],Form[Task],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tasks: List[Task], taskForm: Form[Task]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.43*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Todo list")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""
    
    <H2>Ajouter une tache</H2>
    """),_display_(Seq[Any](/*7.6*/form(routes.Application.newTask())/*7.40*/{_display_(Seq[Any](format.raw/*7.41*/("""
    """),_display_(Seq[Any](/*8.6*/inputText(taskForm("message")))),format.raw/*8.36*/("""
    <input type="submit" value="creation">
    """)))})),format.raw/*10.6*/("""
""")))})),format.raw/*11.2*/("""
"""))}
    }
    
    def render(tasks:List[Task],taskForm:Form[Task]): play.api.templates.Html = apply(tasks,taskForm)
    
    def f:((List[Task],Form[Task]) => play.api.templates.Html) = (tasks,taskForm) => apply(tasks,taskForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 04 09:12:04 CET 2013
                    SOURCE: C:/Users/thor/PLAY/todolist/app/views/index.scala.html
                    HASH: 2b78517b43db44e74e4a46340961a34f702edadc
                    MATRIX: 738->1|872->42|899->60|935->62|960->79|999->81|1075->123|1117->157|1155->158|1195->164|1246->194|1326->243|1359->245
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|35->7|36->8|36->8|38->10|39->11
                    -- GENERATED --
                */
            