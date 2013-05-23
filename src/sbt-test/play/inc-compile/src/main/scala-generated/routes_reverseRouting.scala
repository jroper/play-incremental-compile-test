// @SOURCE:/Users/jroper/tmp/scala-compilation-times/conf/routes
// @HASH:9e7f57be09db9ebcd748eed1631a93dbd9e6d864
// @DATE:Thu May 23 11:10:23 EST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._
import java.net.URLEncoder

import play.api.mvc._


import Router.queryString


// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
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
                          

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
class ReverseResource2 {
    

// @LINE:25
def delete(id:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "resource2/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:22
def get(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource2/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:20
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource2/new")
}
                                                

// @LINE:24
def update(id:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "resource2/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:21
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "resource2")
}
                                                

// @LINE:19
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource2")
}
                                                

// @LINE:23
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource2/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                                                
    
}
                          

// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
class ReverseResource6 {
    

// @LINE:57
def delete(id:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "resource6/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:54
def get(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource6/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:52
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource6/new")
}
                                                

// @LINE:56
def update(id:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "resource6/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:53
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "resource6")
}
                                                

// @LINE:51
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource6")
}
                                                

// @LINE:55
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource6/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                                                
    
}
                          

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
class ReverseResource5 {
    

// @LINE:49
def delete(id:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "resource5/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:46
def get(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource5/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:44
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource5/new")
}
                                                

// @LINE:48
def update(id:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "resource5/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:45
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "resource5")
}
                                                

// @LINE:43
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource5")
}
                                                

// @LINE:47
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
                          

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseResource3 {
    

// @LINE:33
def delete(id:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "resource3/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:30
def get(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource3/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:28
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource3/new")
}
                                                

// @LINE:32
def update(id:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "resource3/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:29
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "resource3")
}
                                                

// @LINE:27
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource3")
}
                                                

// @LINE:31
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource3/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                                                
    
}
                          

// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
class ReverseResource4 {
    

// @LINE:41
def delete(id:Long): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "resource4/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:38
def get(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource4/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:36
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource4/new")
}
                                                

// @LINE:40
def update(id:Long): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "resource4/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:37
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "resource4")
}
                                                

// @LINE:35
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource4")
}
                                                

// @LINE:39
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "resource4/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                                                
    
}
                          
}
                  


// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
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
              

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
class ReverseResource2 {
    

// @LINE:25
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource2.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "resource2/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:22
def get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource2.get",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource2/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:20
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource2.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource2/new"})
      }
   """
)
                        

// @LINE:24
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource2.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "resource2/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:21
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource2.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resource2"})
      }
   """
)
                        

// @LINE:19
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource2.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource2"})
      }
   """
)
                        

// @LINE:23
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource2.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource2/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        
    
}
              

// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
class ReverseResource6 {
    

// @LINE:57
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource6.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "resource6/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:54
def get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource6.get",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource6/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:52
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource6.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource6/new"})
      }
   """
)
                        

// @LINE:56
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource6.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "resource6/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:53
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource6.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resource6"})
      }
   """
)
                        

// @LINE:51
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource6.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource6"})
      }
   """
)
                        

// @LINE:55
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource6.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource6/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        
    
}
              

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
class ReverseResource5 {
    

// @LINE:49
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource5.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "resource5/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:46
def get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource5.get",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource5/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:44
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource5.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource5/new"})
      }
   """
)
                        

// @LINE:48
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource5.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "resource5/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:45
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource5.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resource5"})
      }
   """
)
                        

// @LINE:43
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource5.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource5"})
      }
   """
)
                        

// @LINE:47
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
              

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseResource3 {
    

// @LINE:33
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource3.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "resource3/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:30
def get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource3.get",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource3/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:28
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource3.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource3/new"})
      }
   """
)
                        

// @LINE:32
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource3.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "resource3/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:29
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource3.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resource3"})
      }
   """
)
                        

// @LINE:27
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource3.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource3"})
      }
   """
)
                        

// @LINE:31
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource3.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource3/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        
    
}
              

// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
class ReverseResource4 {
    

// @LINE:41
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource4.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "resource4/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:38
def get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource4.get",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource4/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:36
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource4.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource4/new"})
      }
   """
)
                        

// @LINE:40
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource4.update",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "resource4/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:37
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource4.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resource4"})
      }
   """
)
                        

// @LINE:35
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Resource4.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resource4"})
      }
   """
)
                        

// @LINE:39
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
        


// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
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
                          

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
class ReverseResource2 {
    

// @LINE:25
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource2.delete(id), HandlerDef(this, "controllers.Resource2", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """resource2/$id<[^/]+>""")
)
                      

// @LINE:22
def get(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource2.get(id), HandlerDef(this, "controllers.Resource2", "get", Seq(classOf[Long]), "GET", """""", _prefix + """resource2/$id<[^/]+>""")
)
                      

// @LINE:20
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource2.create(), HandlerDef(this, "controllers.Resource2", "create", Seq(), "GET", """""", _prefix + """resource2/new""")
)
                      

// @LINE:24
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource2.update(id), HandlerDef(this, "controllers.Resource2", "update", Seq(classOf[Long]), "PUT", """""", _prefix + """resource2/$id<[^/]+>""")
)
                      

// @LINE:21
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource2.save(), HandlerDef(this, "controllers.Resource2", "save", Seq(), "POST", """""", _prefix + """resource2""")
)
                      

// @LINE:19
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource2.index(), HandlerDef(this, "controllers.Resource2", "index", Seq(), "GET", """""", _prefix + """resource2""")
)
                      

// @LINE:23
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource2.edit(id), HandlerDef(this, "controllers.Resource2", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """resource2/$id<[^/]+>/edit""")
)
                      
    
}
                          

// @LINE:57
// @LINE:56
// @LINE:55
// @LINE:54
// @LINE:53
// @LINE:52
// @LINE:51
class ReverseResource6 {
    

// @LINE:57
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource6.delete(id), HandlerDef(this, "controllers.Resource6", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """resource6/$id<[^/]+>""")
)
                      

// @LINE:54
def get(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource6.get(id), HandlerDef(this, "controllers.Resource6", "get", Seq(classOf[Long]), "GET", """""", _prefix + """resource6/$id<[^/]+>""")
)
                      

// @LINE:52
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource6.create(), HandlerDef(this, "controllers.Resource6", "create", Seq(), "GET", """""", _prefix + """resource6/new""")
)
                      

// @LINE:56
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource6.update(id), HandlerDef(this, "controllers.Resource6", "update", Seq(classOf[Long]), "PUT", """""", _prefix + """resource6/$id<[^/]+>""")
)
                      

// @LINE:53
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource6.save(), HandlerDef(this, "controllers.Resource6", "save", Seq(), "POST", """""", _prefix + """resource6""")
)
                      

// @LINE:51
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource6.index(), HandlerDef(this, "controllers.Resource6", "index", Seq(), "GET", """""", _prefix + """resource6""")
)
                      

// @LINE:55
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource6.edit(id), HandlerDef(this, "controllers.Resource6", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """resource6/$id<[^/]+>/edit""")
)
                      
    
}
                          

// @LINE:49
// @LINE:48
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:43
class ReverseResource5 {
    

// @LINE:49
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource5.delete(id), HandlerDef(this, "controllers.Resource5", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """resource5/$id<[^/]+>""")
)
                      

// @LINE:46
def get(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource5.get(id), HandlerDef(this, "controllers.Resource5", "get", Seq(classOf[Long]), "GET", """""", _prefix + """resource5/$id<[^/]+>""")
)
                      

// @LINE:44
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource5.create(), HandlerDef(this, "controllers.Resource5", "create", Seq(), "GET", """""", _prefix + """resource5/new""")
)
                      

// @LINE:48
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource5.update(id), HandlerDef(this, "controllers.Resource5", "update", Seq(classOf[Long]), "PUT", """""", _prefix + """resource5/$id<[^/]+>""")
)
                      

// @LINE:45
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource5.save(), HandlerDef(this, "controllers.Resource5", "save", Seq(), "POST", """""", _prefix + """resource5""")
)
                      

// @LINE:43
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource5.index(), HandlerDef(this, "controllers.Resource5", "index", Seq(), "GET", """""", _prefix + """resource5""")
)
                      

// @LINE:47
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
                          

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
class ReverseResource3 {
    

// @LINE:33
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource3.delete(id), HandlerDef(this, "controllers.Resource3", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """resource3/$id<[^/]+>""")
)
                      

// @LINE:30
def get(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource3.get(id), HandlerDef(this, "controllers.Resource3", "get", Seq(classOf[Long]), "GET", """""", _prefix + """resource3/$id<[^/]+>""")
)
                      

// @LINE:28
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource3.create(), HandlerDef(this, "controllers.Resource3", "create", Seq(), "GET", """""", _prefix + """resource3/new""")
)
                      

// @LINE:32
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource3.update(id), HandlerDef(this, "controllers.Resource3", "update", Seq(classOf[Long]), "PUT", """""", _prefix + """resource3/$id<[^/]+>""")
)
                      

// @LINE:29
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource3.save(), HandlerDef(this, "controllers.Resource3", "save", Seq(), "POST", """""", _prefix + """resource3""")
)
                      

// @LINE:27
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource3.index(), HandlerDef(this, "controllers.Resource3", "index", Seq(), "GET", """""", _prefix + """resource3""")
)
                      

// @LINE:31
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource3.edit(id), HandlerDef(this, "controllers.Resource3", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """resource3/$id<[^/]+>/edit""")
)
                      
    
}
                          

// @LINE:41
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
class ReverseResource4 {
    

// @LINE:41
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource4.delete(id), HandlerDef(this, "controllers.Resource4", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """resource4/$id<[^/]+>""")
)
                      

// @LINE:38
def get(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource4.get(id), HandlerDef(this, "controllers.Resource4", "get", Seq(classOf[Long]), "GET", """""", _prefix + """resource4/$id<[^/]+>""")
)
                      

// @LINE:36
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource4.create(), HandlerDef(this, "controllers.Resource4", "create", Seq(), "GET", """""", _prefix + """resource4/new""")
)
                      

// @LINE:40
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource4.update(id), HandlerDef(this, "controllers.Resource4", "update", Seq(classOf[Long]), "PUT", """""", _prefix + """resource4/$id<[^/]+>""")
)
                      

// @LINE:37
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource4.save(), HandlerDef(this, "controllers.Resource4", "save", Seq(), "POST", """""", _prefix + """resource4""")
)
                      

// @LINE:35
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource4.index(), HandlerDef(this, "controllers.Resource4", "index", Seq(), "GET", """""", _prefix + """resource4""")
)
                      

// @LINE:39
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Resource4.edit(id), HandlerDef(this, "controllers.Resource4", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """resource4/$id<[^/]+>/edit""")
)
                      
    
}
                          
}
                  
      