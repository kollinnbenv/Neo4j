# Neo4j Insight

Build | Unit Tests | Cross Version Tests | Cross Browser Tests Windows | Cross Browser Tests MacOs
:---: | :---: | :---: | :---: | :---: 
[![build](https://live.neo4j-build.io/app/rest/builds/buildType:(id:UserInterface_Neo4jInsight_Build)/statusIcon)](https://live.neo4j-build.io/viewType.html?buildTypeId=UserInterface_Neo4jInsight_Build) | [![unit tests](https://live.neo4j-build.io/app/rest/builds/buildType:(UserInterface_Neo4jInsight_Test)/statusIcon)](https://live.neo4j-build.io/viewType.html?buildTypeId=UserInterface_Neo4jInsight_Test) | [![cross version tests](https://live.neo4j-build.io/app/rest/builds/buildType:(UserInterface_Neo4jInsight_CrossVersionTest)/statusIcon)](https://live.neo4j-build.io/viewType.html?buildTypeId=UserInterface_Neo4jInsight_CrossVersionTest) | [![windows tests](https://live.neo4j-build.io/app/rest/builds/buildType:(UserInterface_Neo4jInsight_WindowsCrossBrowserTests)/statusIcon)](https://live.neo4j-build.io/viewType.html?buildTypeId=UserInterface_Neo4jInsight_WindowsCrossBrowserTests) | [![MacOs Tests](https://live.neo4j-build.io/app/rest/builds/buildType:(UserInterface_Neo4jInsight_TestMacos)/statusIcon)](https://live.neo4j-build.io/viewType.html?buildTypeId=UserInterface_Neo4jInsight_TestMacos)

## Development setup
1. Clone this repo
1. Install yarn globally (not required but recommended): `npm install -g yarn`
1. Install project dependencies: `yarn`

### Development server
`yarn start` and point your web browser to `http://localhost:8085`.

### Testing
- `yarn test` to run a single unit test run. A linter will run first.
- `yarn dev` to have continous unit testing on every file change.
- `yarn run e2e {browserNames}` to run end-to-end tests with [TestCafe](https://github.com/DevExpress/testcafe) (you can specify the browsers to run in a comma-separated list or type `all`. More info is available in the [TestCafe documentation](https://devexpress.github.io/testcafe/documentation/using-testcafe/common-concepts/browsers/browser-support.html) and our [testcafe README](https://github.com/neo-technology/neo4j-insight/tree/master/testcafe)).

## Devtools
Download these two chrome extensions:
- [React devtools](https://chrome.google.com/webstore/detail/react-developer-tools/fmkadmapgofadopljbjfkapdkoienihi?hl=en)
