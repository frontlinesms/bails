target(name:'bailsInit') {
	symlink(link:"${basedir}/bails",
			overwrite:true,
			resource:"/target/plugins/bails-${bailsVersion}/scripts")
}
setDefaultTarget bailsInit
	
