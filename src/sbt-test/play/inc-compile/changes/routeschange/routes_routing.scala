// @SOURCE:/Users/jroper/tmp/scala-compilation-times/conf/routes
// @HASH:afd17eab92359986aac1ec40258eb8e514c9da92
// @DATE:Thu May 23 11:13:48 EST 2013


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
        

// @LINE:18
private[this] lazy val controllers_Resource1_foo9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource1/"),DynamicPart("id", """[^/]+""",true),StaticPart("/foo"))))
        

// @LINE:20
private[this] lazy val controllers_Resource2_index10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource2"))))
        

// @LINE:21
private[this] lazy val controllers_Resource2_create11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource2/new"))))
        

// @LINE:22
private[this] lazy val controllers_Resource2_save12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource2"))))
        

// @LINE:23
private[this] lazy val controllers_Resource2_get13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource2/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:24
private[this] lazy val controllers_Resource2_edit14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource2/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
        

// @LINE:25
private[this] lazy val controllers_Resource2_update15 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource2/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_Resource2_delete16 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource2/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:28
private[this] lazy val controllers_Resource3_index17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource3"))))
        

// @LINE:29
private[this] lazy val controllers_Resource3_create18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource3/new"))))
        

// @LINE:30
private[this] lazy val controllers_Resource3_save19 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource3"))))
        

// @LINE:31
private[this] lazy val controllers_Resource3_get20 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource3/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:32
private[this] lazy val controllers_Resource3_edit21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource3/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
        

// @LINE:33
private[this] lazy val controllers_Resource3_update22 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource3/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:34
private[this] lazy val controllers_Resource3_delete23 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource3/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:36
private[this] lazy val controllers_Resource4_index24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource4"))))
        

// @LINE:37
private[this] lazy val controllers_Resource4_create25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource4/new"))))
        

// @LINE:38
private[this] lazy val controllers_Resource4_save26 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource4"))))
        

// @LINE:39
private[this] lazy val controllers_Resource4_get27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource4/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:40
private[this] lazy val controllers_Resource4_edit28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource4/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
        

// @LINE:41
private[this] lazy val controllers_Resource4_update29 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource4/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:42
private[this] lazy val controllers_Resource4_delete30 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource4/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:44
private[this] lazy val controllers_Resource5_index31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource5"))))
        

// @LINE:45
private[this] lazy val controllers_Resource5_create32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource5/new"))))
        

// @LINE:46
private[this] lazy val controllers_Resource5_save33 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource5"))))
        

// @LINE:47
private[this] lazy val controllers_Resource5_get34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource5/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:48
private[this] lazy val controllers_Resource5_edit35 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource5/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
        

// @LINE:49
private[this] lazy val controllers_Resource5_update36 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource5/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:50
private[this] lazy val controllers_Resource5_delete37 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource5/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:52
private[this] lazy val controllers_Resource6_index38 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource6"))))
        

// @LINE:53
private[this] lazy val controllers_Resource6_create39 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource6/new"))))
        

// @LINE:54
private[this] lazy val controllers_Resource6_save40 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource6"))))
        

// @LINE:55
private[this] lazy val controllers_Resource6_get41 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource6/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:56
private[this] lazy val controllers_Resource6_edit42 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource6/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
        

// @LINE:57
private[this] lazy val controllers_Resource6_update43 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource6/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:58
private[this] lazy val controllers_Resource6_delete44 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resource6/"),DynamicPart("id", """[^/]+""",true))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource1""","""controllers.Resource1.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource1/new""","""controllers.Resource1.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource1""","""controllers.Resource1.save"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource1/$id<[^/]+>""","""controllers.Resource1.get(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource1/$id<[^/]+>/edit""","""controllers.Resource1.edit(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource1/$id<[^/]+>""","""controllers.Resource1.update(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource1/$id<[^/]+>""","""controllers.Resource1.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource1/$id<[^/]+>/foo""","""controllers.Resource1.foo(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource2""","""controllers.Resource2.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource2/new""","""controllers.Resource2.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource2""","""controllers.Resource2.save"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource2/$id<[^/]+>""","""controllers.Resource2.get(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource2/$id<[^/]+>/edit""","""controllers.Resource2.edit(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource2/$id<[^/]+>""","""controllers.Resource2.update(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource2/$id<[^/]+>""","""controllers.Resource2.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource3""","""controllers.Resource3.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource3/new""","""controllers.Resource3.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource3""","""controllers.Resource3.save"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource3/$id<[^/]+>""","""controllers.Resource3.get(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource3/$id<[^/]+>/edit""","""controllers.Resource3.edit(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource3/$id<[^/]+>""","""controllers.Resource3.update(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource3/$id<[^/]+>""","""controllers.Resource3.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource4""","""controllers.Resource4.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource4/new""","""controllers.Resource4.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource4""","""controllers.Resource4.save"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource4/$id<[^/]+>""","""controllers.Resource4.get(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource4/$id<[^/]+>/edit""","""controllers.Resource4.edit(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource4/$id<[^/]+>""","""controllers.Resource4.update(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource4/$id<[^/]+>""","""controllers.Resource4.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource5""","""controllers.Resource5.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource5/new""","""controllers.Resource5.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource5""","""controllers.Resource5.save"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource5/$id<[^/]+>""","""controllers.Resource5.get(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource5/$id<[^/]+>/edit""","""controllers.Resource5.edit(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource5/$id<[^/]+>""","""controllers.Resource5.update(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource5/$id<[^/]+>""","""controllers.Resource5.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource6""","""controllers.Resource6.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource6/new""","""controllers.Resource6.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource6""","""controllers.Resource6.save"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource6/$id<[^/]+>""","""controllers.Resource6.get(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource6/$id<[^/]+>/edit""","""controllers.Resource6.edit(id:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource6/$id<[^/]+>""","""controllers.Resource6.update(id:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resource6/$id<[^/]+>""","""controllers.Resource6.delete(id:Long)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:18
case controllers_Resource1_foo9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource1.foo(id), HandlerDef(this, "controllers.Resource1", "foo", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource1/$id<[^/]+>/foo"""))
   }
}
        

// @LINE:20
case controllers_Resource2_index10(params) => {
   call { 
        invokeHandler(controllers.Resource2.index, HandlerDef(this, "controllers.Resource2", "index", Nil,"GET", """""", Routes.prefix + """resource2"""))
   }
}
        

// @LINE:21
case controllers_Resource2_create11(params) => {
   call { 
        invokeHandler(controllers.Resource2.create, HandlerDef(this, "controllers.Resource2", "create", Nil,"GET", """""", Routes.prefix + """resource2/new"""))
   }
}
        

// @LINE:22
case controllers_Resource2_save12(params) => {
   call { 
        invokeHandler(controllers.Resource2.save, HandlerDef(this, "controllers.Resource2", "save", Nil,"POST", """""", Routes.prefix + """resource2"""))
   }
}
        

// @LINE:23
case controllers_Resource2_get13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource2.get(id), HandlerDef(this, "controllers.Resource2", "get", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource2/$id<[^/]+>"""))
   }
}
        

// @LINE:24
case controllers_Resource2_edit14(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource2.edit(id), HandlerDef(this, "controllers.Resource2", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource2/$id<[^/]+>/edit"""))
   }
}
        

// @LINE:25
case controllers_Resource2_update15(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource2.update(id), HandlerDef(this, "controllers.Resource2", "update", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """resource2/$id<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_Resource2_delete16(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource2.delete(id), HandlerDef(this, "controllers.Resource2", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """resource2/$id<[^/]+>"""))
   }
}
        

// @LINE:28
case controllers_Resource3_index17(params) => {
   call { 
        invokeHandler(controllers.Resource3.index, HandlerDef(this, "controllers.Resource3", "index", Nil,"GET", """""", Routes.prefix + """resource3"""))
   }
}
        

// @LINE:29
case controllers_Resource3_create18(params) => {
   call { 
        invokeHandler(controllers.Resource3.create, HandlerDef(this, "controllers.Resource3", "create", Nil,"GET", """""", Routes.prefix + """resource3/new"""))
   }
}
        

// @LINE:30
case controllers_Resource3_save19(params) => {
   call { 
        invokeHandler(controllers.Resource3.save, HandlerDef(this, "controllers.Resource3", "save", Nil,"POST", """""", Routes.prefix + """resource3"""))
   }
}
        

// @LINE:31
case controllers_Resource3_get20(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource3.get(id), HandlerDef(this, "controllers.Resource3", "get", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource3/$id<[^/]+>"""))
   }
}
        

// @LINE:32
case controllers_Resource3_edit21(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource3.edit(id), HandlerDef(this, "controllers.Resource3", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource3/$id<[^/]+>/edit"""))
   }
}
        

// @LINE:33
case controllers_Resource3_update22(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource3.update(id), HandlerDef(this, "controllers.Resource3", "update", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """resource3/$id<[^/]+>"""))
   }
}
        

// @LINE:34
case controllers_Resource3_delete23(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource3.delete(id), HandlerDef(this, "controllers.Resource3", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """resource3/$id<[^/]+>"""))
   }
}
        

// @LINE:36
case controllers_Resource4_index24(params) => {
   call { 
        invokeHandler(controllers.Resource4.index, HandlerDef(this, "controllers.Resource4", "index", Nil,"GET", """""", Routes.prefix + """resource4"""))
   }
}
        

// @LINE:37
case controllers_Resource4_create25(params) => {
   call { 
        invokeHandler(controllers.Resource4.create, HandlerDef(this, "controllers.Resource4", "create", Nil,"GET", """""", Routes.prefix + """resource4/new"""))
   }
}
        

// @LINE:38
case controllers_Resource4_save26(params) => {
   call { 
        invokeHandler(controllers.Resource4.save, HandlerDef(this, "controllers.Resource4", "save", Nil,"POST", """""", Routes.prefix + """resource4"""))
   }
}
        

// @LINE:39
case controllers_Resource4_get27(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource4.get(id), HandlerDef(this, "controllers.Resource4", "get", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource4/$id<[^/]+>"""))
   }
}
        

// @LINE:40
case controllers_Resource4_edit28(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource4.edit(id), HandlerDef(this, "controllers.Resource4", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource4/$id<[^/]+>/edit"""))
   }
}
        

// @LINE:41
case controllers_Resource4_update29(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource4.update(id), HandlerDef(this, "controllers.Resource4", "update", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """resource4/$id<[^/]+>"""))
   }
}
        

// @LINE:42
case controllers_Resource4_delete30(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource4.delete(id), HandlerDef(this, "controllers.Resource4", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """resource4/$id<[^/]+>"""))
   }
}
        

// @LINE:44
case controllers_Resource5_index31(params) => {
   call { 
        invokeHandler(controllers.Resource5.index, HandlerDef(this, "controllers.Resource5", "index", Nil,"GET", """""", Routes.prefix + """resource5"""))
   }
}
        

// @LINE:45
case controllers_Resource5_create32(params) => {
   call { 
        invokeHandler(controllers.Resource5.create, HandlerDef(this, "controllers.Resource5", "create", Nil,"GET", """""", Routes.prefix + """resource5/new"""))
   }
}
        

// @LINE:46
case controllers_Resource5_save33(params) => {
   call { 
        invokeHandler(controllers.Resource5.save, HandlerDef(this, "controllers.Resource5", "save", Nil,"POST", """""", Routes.prefix + """resource5"""))
   }
}
        

// @LINE:47
case controllers_Resource5_get34(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource5.get(id), HandlerDef(this, "controllers.Resource5", "get", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource5/$id<[^/]+>"""))
   }
}
        

// @LINE:48
case controllers_Resource5_edit35(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource5.edit(id), HandlerDef(this, "controllers.Resource5", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource5/$id<[^/]+>/edit"""))
   }
}
        

// @LINE:49
case controllers_Resource5_update36(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource5.update(id), HandlerDef(this, "controllers.Resource5", "update", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """resource5/$id<[^/]+>"""))
   }
}
        

// @LINE:50
case controllers_Resource5_delete37(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource5.delete(id), HandlerDef(this, "controllers.Resource5", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """resource5/$id<[^/]+>"""))
   }
}
        

// @LINE:52
case controllers_Resource6_index38(params) => {
   call { 
        invokeHandler(controllers.Resource6.index, HandlerDef(this, "controllers.Resource6", "index", Nil,"GET", """""", Routes.prefix + """resource6"""))
   }
}
        

// @LINE:53
case controllers_Resource6_create39(params) => {
   call { 
        invokeHandler(controllers.Resource6.create, HandlerDef(this, "controllers.Resource6", "create", Nil,"GET", """""", Routes.prefix + """resource6/new"""))
   }
}
        

// @LINE:54
case controllers_Resource6_save40(params) => {
   call { 
        invokeHandler(controllers.Resource6.save, HandlerDef(this, "controllers.Resource6", "save", Nil,"POST", """""", Routes.prefix + """resource6"""))
   }
}
        

// @LINE:55
case controllers_Resource6_get41(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource6.get(id), HandlerDef(this, "controllers.Resource6", "get", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource6/$id<[^/]+>"""))
   }
}
        

// @LINE:56
case controllers_Resource6_edit42(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource6.edit(id), HandlerDef(this, "controllers.Resource6", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """resource6/$id<[^/]+>/edit"""))
   }
}
        

// @LINE:57
case controllers_Resource6_update43(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource6.update(id), HandlerDef(this, "controllers.Resource6", "update", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """resource6/$id<[^/]+>"""))
   }
}
        

// @LINE:58
case controllers_Resource6_delete44(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Resource6.delete(id), HandlerDef(this, "controllers.Resource6", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """resource6/$id<[^/]+>"""))
   }
}
        
}
    
}
        