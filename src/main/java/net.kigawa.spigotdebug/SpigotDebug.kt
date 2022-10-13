package net.kigawa.spigotdebug

import org.apache.maven.plugin.logging.Log
import org.apache.maven.plugins.annotations.Mojo

@Mojo(name = "spigot-debug")
class SpigotDebug : org.apache.maven.plugin.Mojo {
    private var log: Log? = null

    override fun execute() {
        log?.info("Hello, world")
    }

    override fun setLog(log: Log?) {
        this.log = log
    }

    override fun getLog(): Log? {
        return log
    }
}