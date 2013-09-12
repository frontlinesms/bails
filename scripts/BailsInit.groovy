target(name:'bailsInit') {
	def bailsVersion = '0.3.1'

	symlink(link:"${basedir}/bails",
			overwrite:true,
			resource:"${basedir}/target/plugins/bails-${bailsVersion}/scripts",
			failonerror:true)
	exec(executable:'chmod',
			dir:"${basedir}/bails",
			failonerror:true) {
		arg(line:'-R +x .')
	}
}
setDefaultTarget bailsInit

