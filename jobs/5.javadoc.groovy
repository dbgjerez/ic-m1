
job('ic-m1-javadoc') {
    scm {
        git('git://github.com/dbgjerez/ic-m1.git')
    }
    triggers {
    	 upstream('ic-m1-sonar', 'SUCCESS')
    }
    steps {
        gradle('javadoc')
    }
}
