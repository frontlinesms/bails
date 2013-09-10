target(name:'bailsInit') {
	def bailsVersion = '0.1-SNAPSHOT'
	symlink(link:"${basedir}/bails",
			overwrite:true,
			resource:"${basedir}/target/plugins/bails-${bailsVersion}/scripts")
}
setDefaultTarget bailsInit

