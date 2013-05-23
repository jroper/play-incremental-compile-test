// @SOURCE:/Users/jroper/tmp/scala-compilation-times/conf/routes
// @HASH:afd17eab92359986aac1ec40258eb8e514c9da92
// @DATE:Thu May 23 11:13:48 EST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._
import java.net.URLEncoder

import play.api.mvc._


import Router.queryString


// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseResource1 {
    

// @LINE:17
def delete(id:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "resource1/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:14
def get(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource1/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:18
def foo(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource1/" + implicitly[PathBindable[Long]].unbind("id", id) + "/foo")
}
                                                

// @LINE:12
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource1/new")
}
                                                

// @LINE:16
def update(id:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "resource1/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:13
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "resource1")
}
                                                

// @LINE:11
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource1")
}
                                                

// @LINE:15
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource1/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                                                
    
}
                          

// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseResource2 {
    

// @LINE:26
def delete(id:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "resource2/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:23
def get(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource2/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:21
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource2/new")
}
                                                

// @LINE:25
def update(id:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "resource2/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:22
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "resource2")
}
                                                

// @LINE:20
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource2")
}
                                                

// @LINE:24
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource2/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                                                
    
}
                          

// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
class ReverseResource6 {
    

// @LINE:58
def delete(id:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "resource6/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:55
def get(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource6/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:53
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource6/new")
}
                                                

// @LINE:57
def update(id:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "resource6/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:54
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "resource6")
}
                                                

// @LINE:52
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource6")
}
                                                

// @LINE:56
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource6/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                                                
    
}
                          

// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
class ReverseResource5 {
    

// @LINE:50
def delete(id:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "resource5/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:47
def get(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource5/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:45
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource5/new")
}
                                                

// @LINE:49
def update(id:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "resource5/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:46
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "resource5")
}
                                                

// @LINE:44
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource5")
}
                                                

// @LINE:48
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource5/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReverseResource3 {
    

// @LINE:34
def delete(id:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "resource3/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:31
def get(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource3/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:29
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource3/new")
}
                                                

// @LINE:33
def update(id:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "resource3/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:30
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "resource3")
}
                                                

// @LINE:28
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource3")
}
                                                

// @LINE:32
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource3/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                                                
    
}
                          

// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
class ReverseResource4 {
    

// @LINE:42
def delete(id:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "resource4/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:39
def get(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource4/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:37
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource4/new")
}
                                                

// @LINE:41
def update(id:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "resource4/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:38
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "resource4")
}
                                                

// @LINE:36
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource4")
}
                                                

// @LINE:40
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource4/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                                                
    
}
                          
}
                  


// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseResource1 {
    

// @LINE:17
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource1.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "resource1/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:14
def get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource1.get",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource1/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:18
def foo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource1.foo",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource1/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/foo"})
      }
   """
)
                        

// @LINE:12
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource1.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource1/new"})
      }
   """
)
                        

// @LINE:16
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource1.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "resource1/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:13
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource1.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resource1"})
      }
   """
)
                        

// @LINE:11
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource1.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource1"})
      }
   """
)
                        

// @LINE:15
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource1.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource1/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        
    
}
              

// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseResource2 {
    

// @LINE:26
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource2.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "resource2/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:23
def get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource2.get",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource2/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:21
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource2.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource2/new"})
      }
   """
)
                        

// @LINE:25
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource2.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "resource2/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:22
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource2.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resource2"})
      }
   """
)
                        

// @LINE:20
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource2.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource2"})
      }
   """
)
                        

// @LINE:24
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource2.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource2/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        
    
}
              

// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
class ReverseResource6 {
    

// @LINE:58
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource6.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "resource6/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:55
def get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource6.get",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource6/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:53
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource6.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource6/new"})
      }
   """
)
                        

// @LINE:57
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource6.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "resource6/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:54
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource6.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resource6"})
      }
   """
)
                        

// @LINE:52
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource6.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource6"})
      }
   """
)
                        

// @LINE:56
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource6.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource6/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        
    
}
              

// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
class ReverseResource5 {
    

// @LINE:50
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource5.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "resource5/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:47
def get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource5.get",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource5/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:45
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource5.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource5/new"})
      }
   """
)
                        

// @LINE:49
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource5.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "resource5/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:46
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource5.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resource5"})
      }
   """
)
                        

// @LINE:44
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource5.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource5"})
      }
   """
)
                        

// @LINE:48
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource5.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource5/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReverseResource3 {
    

// @LINE:34
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource3.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "resource3/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:31
def get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource3.get",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource3/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:29
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource3.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource3/new"})
      }
   """
)
                        

// @LINE:33
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource3.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "resource3/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:30
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource3.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resource3"})
      }
   """
)
                        

// @LINE:28
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource3.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource3"})
      }
   """
)
                        

// @LINE:32
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource3.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource3/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        
    
}
              

// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
class ReverseResource4 {
    

// @LINE:42
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource4.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "resource4/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:39
def get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource4.get",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource4/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:37
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource4.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource4/new"})
      }
   """
)
                        

// @LINE:41
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource4.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "resource4/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:38
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource4.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resource4"})
      }
   """
)
                        

// @LINE:36
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource4.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource4"})
      }
   """
)
                        

// @LINE:40
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource4.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource4/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseResource1 {
    

// @LINE:17
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource1.delete(id), HandlerDef(this, "controllers.Resource1", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """resource1/$id<[^/]+>""")
)
                      

// @LINE:14
def get(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource1.get(id), HandlerDef(this, "controllers.Resource1", "get", Seq(classOf[Long]), "GET", """""", _prefix + """resource1/$id<[^/]+>""")
)
                      

// @LINE:18
def foo(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource1.foo(id), HandlerDef(this, "controllers.Resource1", "foo", Seq(classOf[Long]), "GET", """""", _prefix + """resource1/$id<[^/]+>/foo""")
)
                      

// @LINE:12
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource1.create(), HandlerDef(this, "controllers.Resource1", "create", Seq(), "GET", """""", _prefix + """resource1/new""")
)
                      

// @LINE:16
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource1.update(id), HandlerDef(this, "controllers.Resource1", "update", Seq(classOf[Long]), "PUT", """""", _prefix + """resource1/$id<[^/]+>""")
)
                      

// @LINE:13
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource1.save(), HandlerDef(this, "controllers.Resource1", "save", Seq(), "POST", """""", _prefix + """resource1""")
)
                      

// @LINE:11
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource1.index(), HandlerDef(this, "controllers.Resource1", "index", Seq(), "GET", """""", _prefix + """resource1""")
)
                      

// @LINE:15
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource1.edit(id), HandlerDef(this, "controllers.Resource1", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """resource1/$id<[^/]+>/edit""")
)
                      
    
}
                          

// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
class ReverseResource2 {
    

// @LINE:26
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource2.delete(id), HandlerDef(this, "controllers.Resource2", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """resource2/$id<[^/]+>""")
)
                      

// @LINE:23
def get(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource2.get(id), HandlerDef(this, "controllers.Resource2", "get", Seq(classOf[Long]), "GET", """""", _prefix + """resource2/$id<[^/]+>""")
)
                      

// @LINE:21
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource2.create(), HandlerDef(this, "controllers.Resource2", "create", Seq(), "GET", """""", _prefix + """resource2/new""")
)
                      

// @LINE:25
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource2.update(id), HandlerDef(this, "controllers.Resource2", "update", Seq(classOf[Long]), "PUT", """""", _prefix + """resource2/$id<[^/]+>""")
)
                      

// @LINE:22
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource2.save(), HandlerDef(this, "controllers.Resource2", "save", Seq(), "POST", """""", _prefix + """resource2""")
)
                      

// @LINE:20
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource2.index(), HandlerDef(this, "controllers.Resource2", "index", Seq(), "GET", """""", _prefix + """resource2""")
)
                      

// @LINE:24
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource2.edit(id), HandlerDef(this, "controllers.Resource2", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """resource2/$id<[^/]+>/edit""")
)
                      
    
}
                          

// @LINE:58
// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
class ReverseResource6 {
    

// @LINE:58
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource6.delete(id), HandlerDef(this, "controllers.Resource6", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """resource6/$id<[^/]+>""")
)
                      

// @LINE:55
def get(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource6.get(id), HandlerDef(this, "controllers.Resource6", "get", Seq(classOf[Long]), "GET", """""", _prefix + """resource6/$id<[^/]+>""")
)
                      

// @LINE:53
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource6.create(), HandlerDef(this, "controllers.Resource6", "create", Seq(), "GET", """""", _prefix + """resource6/new""")
)
                      

// @LINE:57
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource6.update(id), HandlerDef(this, "controllers.Resource6", "update", Seq(classOf[Long]), "PUT", """""", _prefix + """resource6/$id<[^/]+>""")
)
                      

// @LINE:54
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource6.save(), HandlerDef(this, "controllers.Resource6", "save", Seq(), "POST", """""", _prefix + """resource6""")
)
                      

// @LINE:52
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource6.index(), HandlerDef(this, "controllers.Resource6", "index", Seq(), "GET", """""", _prefix + """resource6""")
)
                      

// @LINE:56
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource6.edit(id), HandlerDef(this, "controllers.Resource6", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """resource6/$id<[^/]+>/edit""")
)
                      
    
}
                          

// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
class ReverseResource5 {
    

// @LINE:50
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource5.delete(id), HandlerDef(this, "controllers.Resource5", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """resource5/$id<[^/]+>""")
)
                      

// @LINE:47
def get(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource5.get(id), HandlerDef(this, "controllers.Resource5", "get", Seq(classOf[Long]), "GET", """""", _prefix + """resource5/$id<[^/]+>""")
)
                      

// @LINE:45
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource5.create(), HandlerDef(this, "controllers.Resource5", "create", Seq(), "GET", """""", _prefix + """resource5/new""")
)
                      

// @LINE:49
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource5.update(id), HandlerDef(this, "controllers.Resource5", "update", Seq(classOf[Long]), "PUT", """""", _prefix + """resource5/$id<[^/]+>""")
)
                      

// @LINE:46
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource5.save(), HandlerDef(this, "controllers.Resource5", "save", Seq(), "POST", """""", _prefix + """resource5""")
)
                      

// @LINE:44
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource5.index(), HandlerDef(this, "controllers.Resource5", "index", Seq(), "GET", """""", _prefix + """resource5""")
)
                      

// @LINE:48
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource5.edit(id), HandlerDef(this, "controllers.Resource5", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """resource5/$id<[^/]+>/edit""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReverseResource3 {
    

// @LINE:34
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource3.delete(id), HandlerDef(this, "controllers.Resource3", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """resource3/$id<[^/]+>""")
)
                      

// @LINE:31
def get(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource3.get(id), HandlerDef(this, "controllers.Resource3", "get", Seq(classOf[Long]), "GET", """""", _prefix + """resource3/$id<[^/]+>""")
)
                      

// @LINE:29
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource3.create(), HandlerDef(this, "controllers.Resource3", "create", Seq(), "GET", """""", _prefix + """resource3/new""")
)
                      

// @LINE:33
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource3.update(id), HandlerDef(this, "controllers.Resource3", "update", Seq(classOf[Long]), "PUT", """""", _prefix + """resource3/$id<[^/]+>""")
)
                      

// @LINE:30
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource3.save(), HandlerDef(this, "controllers.Resource3", "save", Seq(), "POST", """""", _prefix + """resource3""")
)
                      

// @LINE:28
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource3.index(), HandlerDef(this, "controllers.Resource3", "index", Seq(), "GET", """""", _prefix + """resource3""")
)
                      

// @LINE:32
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource3.edit(id), HandlerDef(this, "controllers.Resource3", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """resource3/$id<[^/]+>/edit""")
)
                      
    
}
                          

// @LINE:42
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
class ReverseResource4 {
    

// @LINE:42
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource4.delete(id), HandlerDef(this, "controllers.Resource4", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """resource4/$id<[^/]+>""")
)
                      

// @LINE:39
def get(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource4.get(id), HandlerDef(this, "controllers.Resource4", "get", Seq(classOf[Long]), "GET", """""", _prefix + """resource4/$id<[^/]+>""")
)
                      

// @LINE:37
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource4.create(), HandlerDef(this, "controllers.Resource4", "create", Seq(), "GET", """""", _prefix + """resource4/new""")
)
                      

// @LINE:41
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource4.update(id), HandlerDef(this, "controllers.Resource4", "update", Seq(classOf[Long]), "PUT", """""", _prefix + """resource4/$id<[^/]+>""")
)
                      

// @LINE:38
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource4.save(), HandlerDef(this, "controllers.Resource4", "save", Seq(), "POST", """""", _prefix + """resource4""")
)
                      

// @LINE:36
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource4.index(), HandlerDef(this, "controllers.Resource4", "index", Seq(), "GET", """""", _prefix + """resource4""")
)
                      

// @LINE:40
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource4.edit(id), HandlerDef(this, "controllers.Resource4", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """resource4/$id<[^/]+>/edit""")
)
                      
    
}
                          
}
                  
      