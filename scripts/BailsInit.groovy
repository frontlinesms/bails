target(name:'bailsInit') {
	def projectDir = new File(new File(getClass().protectionDomain.codeSource.location.path).parent).parent
	def pluginDir
	new File(projectDir, 'target/plugins').eachDirMatch(~/bails-.*/) {
		pluginDir = it
	}

	def pluginDescriptorFile = new File(pluginDir, 'BailsGrailsPlugin.groovy')
	def bailsVersion = new GroovyShell().parse("$pluginDescriptorFile.text; return new BailsGrailsPlugin().version").run()

	symlink(link:"${basedir}/bails",
			overwrite:true,
			resource:"target/plugins/bails-${bailsVersion}/scripts",
			failonerror:true)
	exec(executable:'chmod',
			dir:"${basedir}/bails",
			failonerror:true) {
		arg(line:'-R +x .')
	}
}
setDefaultTarget bailsInit

