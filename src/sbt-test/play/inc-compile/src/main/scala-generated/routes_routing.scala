// @SOURCE:/Users/jroper/tmp/scala-compilation-times/conf/routes
// @HASH:9e7f57be09db9ebcd748eed1631a93dbd9e6d864
// @DATE:Thu May 23 11:10:23 EST 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:11
private[this] lazy val controllers_Resource1_index2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource1"))))
        

// @LINE:12
private[this] lazy val controllers_Resource1_create3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource1/new"))))
        

// @LINE:13
private[this] lazy val controllers_Resource1_save4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource1"))))
        

// @LINE:14
private[this] lazy val controllers_Resource1_get5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource1/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:15
private[this] lazy val controllers_Resource1_edit6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource1/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
        

// @LINE:16
private[this] lazy val controllers_Resource1_update7 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource1/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:17
private[this] lazy val controllers_Resource1_delete8 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource1/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:19
private[this] lazy val controllers_Resource2_index9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource2"))))
        

// @LINE:20
private[this] lazy val controllers_Resource2_create10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource2/new"))))
        

// @LINE:21
private[this] lazy val controllers_Resource2_save11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource2"))))
        

// @LINE:22
private[this] lazy val controllers_Resource2_get12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource2/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_Resource2_edit13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource2/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
        

// @LINE:24
private[this] lazy val controllers_Resource2_update14 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource2/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:25
private[this] lazy val controllers_Resource2_delete15 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource2/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:27
private[this] lazy val controllers_Resource3_index16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource3"))))
        

// @LINE:28
private[this] lazy val controllers_Resource3_create17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource3/new"))))
        

// @LINE:29
private[this] lazy val controllers_Resource3_save18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource3"))))
        

// @LINE:30
private[this] lazy val controllers_Resource3_get19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource3/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:31
private[this] lazy val controllers_Resource3_edit20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource3/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
        

// @LINE:32
private[this] lazy val controllers_Resource3_update21 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource3/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:33
private[this] lazy val controllers_Resource3_delete22 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource3/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:35
private[this] lazy val controllers_Resource4_index23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource4"))))
        

// @LINE:36
private[this] lazy val controllers_Resource4_create24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource4/new"))))
        

// @LINE:37
private[this] lazy val controllers_Resource4_save25 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource4"))))
        

// @LINE:38
private[this] lazy val controllers_Resource4_get26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource4/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:39
private[this] lazy val controllers_Resource4_edit27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource4/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
        

// @LINE:40
private[this] lazy val controllers_Resource4_update28 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource4/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:41
private[this] lazy val controllers_Resource4_delete29 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource4/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:43
private[this] lazy val controllers_Resource5_index30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource5"))))
        

// @LINE:44
private[this] lazy val controllers_Resource5_create31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource5/new"))))
        

// @LINE:45
private[this] lazy val controllers_Resource5_save32 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource5"))))
        

// @LINE:46
private[this] lazy val controllers_Resource5_get33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource5/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:47
private[this] lazy val controllers_Resource5_edit34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource5/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
        

// @LINE:48
private[this] lazy val controllers_Resource5_update35 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource5/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:49
private[this] lazy val controllers_Resource5_delete36 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource5/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:51
private[this] lazy val controllers_Resource6_index37 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource6"))))
        

// @LINE:52
private[this] lazy val controllers_Resource6_create38 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource6/new"))))
        

// @LINE:53
private[this] lazy val controllers_Resource6_save39 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource6"))))
        

// @LINE:54
private[this] lazy val controllers_Resource6_get40 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource6/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:55
private[this] lazy val controllers_Resource6_edit41 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource6/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
        

// @LINE:56
private[this] lazy val controllers_Resource6_update42 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource6/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:57
private[this] lazy val controllers_Resource6_delete43 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource6/"),DynamicPart("id", """[^/]+""",true))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource1""","""controllers.Resource1.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource1/new""","""controllers.Resource1.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource1""","""controllers.Resource1.save"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource1/$id<[^/]+>""","""controllers.Resource1.get(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource1/$id<[^/]+>/edit""","""controllers.Resource1.edit(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource1/$id<[^/]+>""","""controllers.Resource1.update(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource1/$id<[^/]+>""","""controllers.Resource1.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource2""","""controllers.Resource2.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource2/new""","""controllers.Resource2.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource2""","""controllers.Resource2.save"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource2/$id<[^/]+>""","""controllers.Resource2.get(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource2/$id<[^/]+>/edit""","""controllers.Resource2.edit(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource2/$id<[^/]+>""","""controllers.Resource2.update(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource2/$id<[^/]+>""","""controllers.Resource2.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource3""","""controllers.Resource3.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource3/new""","""controllers.Resource3.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource3""","""controllers.Resource3.save"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource3/$id<[^/]+>""","""controllers.Resource3.get(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource3/$id<[^/]+>/edit""","""controllers.Resource3.edit(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource3/$id<[^/]+>""","""controllers.Resource3.update(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource3/$id<[^/]+>""","""controllers.Resource3.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource4""","""controllers.Resource4.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource4/new""","""controllers.Resource4.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource4""","""controllers.Resource4.save"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource4/$id<[^/]+>""","""controllers.Resource4.get(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource4/$id<[^/]+>/edit""","""controllers.Resource4.edit(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource4/$id<[^/]+>""","""controllers.Resource4.update(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource4/$id<[^/]+>""","""controllers.Resource4.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource5""","""controllers.Resource5.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource5/new""","""controllers.Resource5.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource5""","""controllers.Resource5.save"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource5/$id<[^/]+>""","""controllers.Resource5.get(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource5/$id<[^/]+>/edit""","""controllers.Resource5.edit(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource5/$id<[^/]+>""","""controllers.Resource5.update(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource5/$id<[^/]+>""","""controllers.Resource5.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource6""","""controllers.Resource6.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource6/new""","""controllers.Resource6.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource6""","""controllers.Resource6.save"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource6/$id<[^/]+>""","""controllers.Resource6.get(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource6/$id<[^/]+>/edit""","""controllers.Resource6.edit(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource6/$id<[^/]+>""","""controllers.Resource6.update(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource6/$id<[^/]+>""","""controllers.Resource6.delete(id:Long)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:11
case controllers_Resource1_index2(params) => {
   call { 
        invokeHandler(controllers.Resource1.index, HandlerDef(this, "controllers.Resource1", "index", Nil,"GET", """""", Routes.prefix + """resource1"""))
   }
}
        

// @LINE:12
case controllers_Resource1_create3(params) => {
   call { 
        invokeHandler(controllers.Resource1.create, HandlerDef(this, "controllers.Resource1", "create", Nil,"GET", """""", Routes.prefix + """resource1/new"""))
   }
}
        

// @LINE:13
case controllers_Resource1_save4(params) => {
   call { 
        invokeHandler(controllers.Resource1.save, HandlerDef(this, "controllers.Resource1", "save", Nil,"POST", """""", Routes.prefix + """resource1"""))
   }
}
        

// @LINE:14
case controllers_Resource1_get5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource1.get(id), HandlerDef(this, "controllers.Resource1", "get", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource1/$id<[^/]+>"""))
   }
}
        

// @LINE:15
case controllers_Resource1_edit6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource1.edit(id), HandlerDef(this, "controllers.Resource1", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource1/$id<[^/]+>/edit"""))
   }
}
        

// @LINE:16
case controllers_Resource1_update7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource1.update(id), HandlerDef(this, "controllers.Resource1", "update", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """resource1/$id<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_Resource1_delete8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource1.delete(id), HandlerDef(this, "controllers.Resource1", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """resource1/$id<[^/]+>"""))
   }
}
        

// @LINE:19
case controllers_Resource2_index9(params) => {
   call { 
        invokeHandler(controllers.Resource2.index, HandlerDef(this, "controllers.Resource2", "index", Nil,"GET", """""", Routes.prefix + """resource2"""))
   }
}
        

// @LINE:20
case controllers_Resource2_create10(params) => {
   call { 
        invokeHandler(controllers.Resource2.create, HandlerDef(this, "controllers.Resource2", "create", Nil,"GET", """""", Routes.prefix + """resource2/new"""))
   }
}
        

// @LINE:21
case controllers_Resource2_save11(params) => {
   call { 
        invokeHandler(controllers.Resource2.save, HandlerDef(this, "controllers.Resource2", "save", Nil,"POST", """""", Routes.prefix + """resource2"""))
   }
}
        

// @LINE:22
case controllers_Resource2_get12(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource2.get(id), HandlerDef(this, "controllers.Resource2", "get", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource2/$id<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_Resource2_edit13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource2.edit(id), HandlerDef(this, "controllers.Resource2", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource2/$id<[^/]+>/edit"""))
   }
}
        

// @LINE:24
case controllers_Resource2_update14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource2.update(id), HandlerDef(this, "controllers.Resource2", "update", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """resource2/$id<[^/]+>"""))
   }
}
        

// @LINE:25
case controllers_Resource2_delete15(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource2.delete(id), HandlerDef(this, "controllers.Resource2", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """resource2/$id<[^/]+>"""))
   }
}
        

// @LINE:27
case controllers_Resource3_index16(params) => {
   call { 
        invokeHandler(controllers.Resource3.index, HandlerDef(this, "controllers.Resource3", "index", Nil,"GET", """""", Routes.prefix + """resource3"""))
   }
}
        

// @LINE:28
case controllers_Resource3_create17(params) => {
   call { 
        invokeHandler(controllers.Resource3.create, HandlerDef(this, "controllers.Resource3", "create", Nil,"GET", """""", Routes.prefix + """resource3/new"""))
   }
}
        

// @LINE:29
case controllers_Resource3_save18(params) => {
   call { 
        invokeHandler(controllers.Resource3.save, HandlerDef(this, "controllers.Resource3", "save", Nil,"POST", """""", Routes.prefix + """resource3"""))
   }
}
        

// @LINE:30
case controllers_Resource3_get19(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource3.get(id), HandlerDef(this, "controllers.Resource3", "get", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource3/$id<[^/]+>"""))
   }
}
        

// @LINE:31
case controllers_Resource3_edit20(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource3.edit(id), HandlerDef(this, "controllers.Resource3", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource3/$id<[^/]+>/edit"""))
   }
}
        

// @LINE:32
case controllers_Resource3_update21(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource3.update(id), HandlerDef(this, "controllers.Resource3", "update", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """resource3/$id<[^/]+>"""))
   }
}
        

// @LINE:33
case controllers_Resource3_delete22(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource3.delete(id), HandlerDef(this, "controllers.Resource3", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """resource3/$id<[^/]+>"""))
   }
}
        

// @LINE:35
case controllers_Resource4_index23(params) => {
   call { 
        invokeHandler(controllers.Resource4.index, HandlerDef(this, "controllers.Resource4", "index", Nil,"GET", """""", Routes.prefix + """resource4"""))
   }
}
        

// @LINE:36
case controllers_Resource4_create24(params) => {
   call { 
        invokeHandler(controllers.Resource4.create, HandlerDef(this, "controllers.Resource4", "create", Nil,"GET", """""", Routes.prefix + """resource4/new"""))
   }
}
        

// @LINE:37
case controllers_Resource4_save25(params) => {
   call { 
        invokeHandler(controllers.Resource4.save, HandlerDef(this, "controllers.Resource4", "save", Nil,"POST", """""", Routes.prefix + """resource4"""))
   }
}
        

// @LINE:38
case controllers_Resource4_get26(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource4.get(id), HandlerDef(this, "controllers.Resource4", "get", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource4/$id<[^/]+>"""))
   }
}
        

// @LINE:39
case controllers_Resource4_edit27(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource4.edit(id), HandlerDef(this, "controllers.Resource4", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource4/$id<[^/]+>/edit"""))
   }
}
        

// @LINE:40
case controllers_Resource4_update28(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource4.update(id), HandlerDef(this, "controllers.Resource4", "update", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """resource4/$id<[^/]+>"""))
   }
}
        

// @LINE:41
case controllers_Resource4_delete29(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource4.delete(id), HandlerDef(this, "controllers.Resource4", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """resource4/$id<[^/]+>"""))
   }
}
        

// @LINE:43
case controllers_Resource5_index30(params) => {
   call { 
        invokeHandler(controllers.Resource5.index, HandlerDef(this, "controllers.Resource5", "index", Nil,"GET", """""", Routes.prefix + """resource5"""))
   }
}
        

// @LINE:44
case controllers_Resource5_create31(params) => {
   call { 
        invokeHandler(controllers.Resource5.create, HandlerDef(this, "controllers.Resource5", "create", Nil,"GET", """""", Routes.prefix + """resource5/new"""))
   }
}
        

// @LINE:45
case controllers_Resource5_save32(params) => {
   call { 
        invokeHandler(controllers.Resource5.save, HandlerDef(this, "controllers.Resource5", "save", Nil,"POST", """""", Routes.prefix + """resource5"""))
   }
}
        

// @LINE:46
case controllers_Resource5_get33(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource5.get(id), HandlerDef(this, "controllers.Resource5", "get", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource5/$id<[^/]+>"""))
   }
}
        

// @LINE:47
case controllers_Resource5_edit34(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource5.edit(id), HandlerDef(this, "controllers.Resource5", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource5/$id<[^/]+>/edit"""))
   }
}
        

// @LINE:48
case controllers_Resource5_update35(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource5.update(id), HandlerDef(this, "controllers.Resource5", "update", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """resource5/$id<[^/]+>"""))
   }
}
        

// @LINE:49
case controllers_Resource5_delete36(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource5.delete(id), HandlerDef(this, "controllers.Resource5", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """resource5/$id<[^/]+>"""))
   }
}
        

// @LINE:51
case controllers_Resource6_index37(params) => {
   call { 
        invokeHandler(controllers.Resource6.index, HandlerDef(this, "controllers.Resource6", "index", Nil,"GET", """""", Routes.prefix + """resource6"""))
   }
}
        

// @LINE:52
case controllers_Resource6_create38(params) => {
   call { 
        invokeHandler(controllers.Resource6.create, HandlerDef(this, "controllers.Resource6", "create", Nil,"GET", """""", Routes.prefix + """resource6/new"""))
   }
}
        

// @LINE:53
case controllers_Resource6_save39(params) => {
   call { 
        invokeHandler(controllers.Resource6.save, HandlerDef(this, "controllers.Resource6", "save", Nil,"POST", """""", Routes.prefix + """resource6"""))
   }
}
        

// @LINE:54
case controllers_Resource6_get40(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource6.get(id), HandlerDef(this, "controllers.Resource6", "get", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource6/$id<[^/]+>"""))
   }
}
        

// @LINE:55
case controllers_Resource6_edit41(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource6.edit(id), HandlerDef(this, "controllers.Resource6", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource6/$id<[^/]+>/edit"""))
   }
}
        

// @LINE:56
case controllers_Resource6_update42(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource6.update(id), HandlerDef(this, "controllers.Resource6", "update", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """resource6/$id<[^/]+>"""))
   }
}
        

// @LINE:57
case controllers_Resource6_delete43(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource6.delete(id), HandlerDef(this, "controllers.Resource6", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """resource6/$id<[^/]+>"""))
   }
}
        
}
    
}
        