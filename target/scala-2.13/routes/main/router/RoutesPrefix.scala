// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/chanchiahsun/Documents/GitHub/ITSD-Group-42/conf/routes
// @DATE:Fri Feb 03 16:54:10 GMT 2023


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
