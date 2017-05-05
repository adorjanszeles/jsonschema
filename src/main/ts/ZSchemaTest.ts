/*import Validator = require("z-schema");

class ZSchemaTest {
    private schema: string;
    private json: any;
    private zSchema: Validator;

    constructor() {
        this.zSchema = new Validator(new Option());
        this.json = {id: 1, amount: 15000, user: {id: 1, name: 'Lili', age: 23, welcomeMessage: 'Hello my name is Lili!'}};
        this.schema = '{"type":"object","id":"urn:jsonschema:hu:sample:resource:Invoice","properties":{"id":{"type":"integer","required":true},"amount":{"type":"integer","minimum":1000.0},"user":{"type":"object","id":"urn:jsonschema:hu:sample:resource:User","required":true,"properties":{"id":{"type":"integer","required":true},"name":{"type":"string","required":true},"age":{"type":"integer"},"welcomeMessage":{"type":"string","pattern":"[A-Z]."}}}}}';
    }

    public runZSchema() {
        let isValid: boolean = this.zSchema.validate(this.json, this.schema);
        console.log(isValid);
    }
}

let zst: ZSchemaTest = new ZSchemaTest();
zst.runZSchema();
*/