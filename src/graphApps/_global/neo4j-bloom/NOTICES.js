import DEPENDENCIES from './NOTICE.txt'

const dependenciesNotices = `Neo4j
Copyright © 2002-${new Date().getFullYear()} Neo4j, Inc. (referred to
in this notice as "Neo4j")
   [http://neo4j.com]

This product includes software ("Software") developed by Neo4j.


Full license texts are found in License Notices area below.

Third-party licenses
--------------------
1 License: (Apache-2.0 OR MIT)
1 License: (BSD-2-Clause OR MIT OR Apache-2.0)
1 License: (GPL-2.0 OR MIT)
1 License: (MIT AND CC-BY-3.0)
2 License: (WTFPL OR MIT)
1 License: Apache 2
1 License: Apache*
19 License: Apache-2.0
2 License: BSD
3 License: BSD*
26 License: BSD-2-Clause
65 License: BSD-3-Clause
1 License: BSD-3-Clause OR MIT
2 License: CC-BY-4.0
6 License: CC0-1.0
76 License: ISC
913 License: MIT
1 License: MIT (http://mootools.net/license.txt)
11 License: MIT*
3 License: Unlicense
5 License: WTFPL


Licenses by third-party software
--------------------------------
${DEPENDENCIES}`

export default dependenciesNotices
