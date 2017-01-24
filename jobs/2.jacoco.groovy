
job('ic-m1-jacoco') {
    scm {
        git('git://github.com/dbgjerez/ic-m1.git')
    }
    triggers {
    	 upstream('ic-m1-clean', 'SUCCESS')
    }
    steps {
        gradle('jacocoTestReport')
    }
}
