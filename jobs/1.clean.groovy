
jobb('ic-w1-clean') {
    scm {
        git('git://github.com/dbgjerez/ic-m1.git')
    }
    triggers {
    	 githubPush()
    }
    steps {
        gradle('clean')
    }
}
