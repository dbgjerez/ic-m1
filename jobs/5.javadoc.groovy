job('ic-w1-javadoc') {
    scm {
        git('git://github.com/dbgjerez/ic-m1.git')
    }
    triggers {
    	 upstream('ic-w1-sonar', 'SUCCESS')
    }
    steps {
        gradle('javadoc')
    }
}
