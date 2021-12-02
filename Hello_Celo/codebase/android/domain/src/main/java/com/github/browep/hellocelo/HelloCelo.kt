package com.github.browep.hellocelo

import org.web3j.protocol.Web3j
import com.github.browep.hellocelo.HelloCelo
import org.web3j.abi.TypeReference
import org.web3j.abi.datatypes.Address
import org.web3j.tx.gas.ContractGasProvider
import org.web3j.tx.TransactionManager
import org.web3j.protocol.core.RemoteFunctionCall
import org.web3j.abi.datatypes.generated.Bytes32
import org.web3j.abi.datatypes.Utf8String
import org.web3j.abi.datatypes.DynamicBytes
import org.web3j.abi.datatypes.Function
import org.web3j.abi.datatypes.Type
import org.web3j.abi.datatypes.generated.Uint8
import org.web3j.crypto.Credentials
import org.web3j.protocol.core.RemoteCall
import org.web3j.protocol.core.methods.response.TransactionReceipt
import org.web3j.tx.Contract
import java.math.BigInteger
import java.util.*

/**
 *
 * Auto generated code.
 *
 * **Do not modify!**
 *
 * Please use the [web3j command line tools](https://docs.web3j.io/command_line.html),
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the
 * [codegen module](https://github.com/web3j/web3j/tree/master/codegen) to update.
 *
 *
 * Generated with web3j version 1.4.1.
 */
class HelloCelo : Contract {
    @Deprecated("")
    protected constructor(contractAddress: String?, web3j: Web3j?, credentials: Credentials?, gasPrice: BigInteger?, gasLimit: BigInteger?) : super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit) {
    }

    protected constructor(contractAddress: String?, web3j: Web3j?, credentials: Credentials?, contractGasProvider: ContractGasProvider?) : super(BINARY, contractAddress, web3j, credentials, contractGasProvider) {}

    @Deprecated("")
    protected constructor(contractAddress: String?, web3j: Web3j?, transactionManager: TransactionManager?, gasPrice: BigInteger?, gasLimit: BigInteger?) : super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit) {
    }

    protected constructor(contractAddress: String?, web3j: Web3j?, transactionManager: TransactionManager?, contractGasProvider: ContractGasProvider?) : super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider) {}

    fun bytes32ToString(_bytes32: ByteArray?): RemoteFunctionCall<String> {
        val function = Function(
            FUNC_BYTES32TOSTRING,
            Arrays.asList<Type<*>>(Bytes32(_bytes32)),
            Arrays.asList<TypeReference<*>>(object : TypeReference<Utf8String?>() {})
        )
        return executeRemoteCallSingleValueReturn(function, String::class.java)
    }

    fun bytesToString(byteCode: ByteArray?): RemoteFunctionCall<String> {
        val function = Function(
            FUNC_BYTESTOSTRING,
            Arrays.asList<Type<*>>(DynamicBytes(byteCode)),
            Arrays.asList<TypeReference<*>>(object : TypeReference<Utf8String?>() {})
        )
        return executeRemoteCallSingleValueReturn(function, String::class.java)
    }

    fun claimUserName(userName: String?): RemoteFunctionCall<TransactionReceipt> {
        val function = Function(
            FUNC_CLAIMUSERNAME,
            Arrays.asList<Type<*>>(Utf8String(userName)), emptyList()
        )
        return executeRemoteCallTransaction(function)
    }

    fun claimUsernameMeta(h: ByteArray?, v: BigInteger?, r: ByteArray?, s: ByteArray?, userName: String?): RemoteFunctionCall<TransactionReceipt> {
        val function = Function(
            FUNC_CLAIMUSERNAMEMETA,
            Arrays.asList<Type<*>>(
                Bytes32(h),
                Uint8(v),
                Bytes32(r),
                Bytes32(s),
                Utf8String(userName)
            ), emptyList()
        )
        return executeRemoteCallTransaction(function)
    }

    fun postForUser(userName: String?): RemoteFunctionCall<String> {
        val function = Function(
            FUNC_POSTFORUSER,
            Arrays.asList<Type<*>>(Utf8String(userName)),
            Arrays.asList<TypeReference<*>>(object : TypeReference<Utf8String?>() {})
        )
        return executeRemoteCallSingleValueReturn(function, String::class.java)
    }

    fun postLocation(userName: String?, location: String?): RemoteFunctionCall<TransactionReceipt> {
        val function = Function(
            FUNC_POSTLOCATION,
            Arrays.asList<Type<*>>(
                Utf8String(userName),
                Utf8String(location)
            ), emptyList()
        )
        return executeRemoteCallTransaction(function)
    }

    fun postLocationMeta(h: ByteArray?, v: BigInteger?, r: ByteArray?, s: ByteArray?, userName: String?, location: String?): RemoteFunctionCall<TransactionReceipt> {
        val function = Function(
            FUNC_POSTLOCATIONMETA,
            Arrays.asList<Type<*>>(
                Bytes32(h),
                Uint8(v),
                Bytes32(r),
                Bytes32(s),
                Utf8String(userName),
                Utf8String(location)
            ), emptyList()
        )
        return executeRemoteCallTransaction(function)
    }

    fun stringToBytes32(source: String?): RemoteFunctionCall<ByteArray> {
        val function = Function(
            FUNC_STRINGTOBYTES32,
            Arrays.asList<Type<*>>(Utf8String(source)),
            Arrays.asList<TypeReference<*>>(object : TypeReference<Bytes32?>() {})
        )
        return executeRemoteCallSingleValueReturn(function, ByteArray::class.java)
    }

    fun verifyMsg(h: ByteArray?, v: BigInteger?, r: ByteArray?, s: ByteArray?, msgStr: String?): RemoteFunctionCall<String> {
        val function = Function(
            FUNC_VERIFYMSG,
            Arrays.asList<Type<*>>(
                Bytes32(h),
                Uint8(v),
                Bytes32(r),
                Bytes32(s),
                Utf8String(msgStr)
            ),
            Arrays.asList<TypeReference<*>>(object : TypeReference<Address?>() {})
        )
        return executeRemoteCallSingleValueReturn(function, String::class.java)
    }

    companion object {
        const val BINARY =
            "608060405234801561001057600080fd5b50611a91806100206000396000f3fe608060405234801561001057600080fd5b50600436106100925760003560e01c80639201de55116100665780639201de55146104a0578063a7ba29f814610547578063a9cfefce146106c4578063c65b0a5914610816578063cfb519281461092657610092565b806214a437146100975780631db0cfd01461017d57806339614e4f146102385780635249b0f41461036c575b600080fd5b61017b600480360360a08110156100ad57600080fd5b8101908080359060200190929190803560ff1690602001909291908035906020019092919080359060200190929190803590602001906401000000008111156100f557600080fd5b82018360208201111561010757600080fd5b8035906020019184600183028401116401000000008311171561012957600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f8201169050808301925050505050505091929192905050506109f5565b005b6102366004803603602081101561019357600080fd5b81019080803590602001906401000000008111156101b057600080fd5b8201836020820111156101c257600080fd5b803590602001918460018302840111640100000000831117156101e457600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050610c89565b005b6102f16004803603602081101561024e57600080fd5b810190808035906020019064010000000081111561026b57600080fd5b82018360208201111561027d57600080fd5b8035906020019184600183028401116401000000008311171561029f57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050610e60565b6040518080602001828103825283818151815260200191508051906020019080838360005b83811015610331578082015181840152602081019050610316565b50505050905090810190601f16801561035e5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6104256004803603602081101561038257600080fd5b810190808035906020019064010000000081111561039f57600080fd5b8201836020820111156103b157600080fd5b803590602001918460018302840111640100000000831117156103d357600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050610f52565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561046557808201518184015260208101905061044a565b50505050905090810190601f1680156104925780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6104cc600480360360208110156104b657600080fd5b81019080803590602001909291905050506110d7565b6040518080602001828103825283818151815260200191508051906020019080838360005b8381101561050c5780820151818401526020810190506104f1565b50505050905090810190601f1680156105395780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6106c2600480360360c081101561055d57600080fd5b8101908080359060200190929190803560ff1690602001909291908035906020019092919080359060200190929190803590602001906401000000008111156105a557600080fd5b8201836020820111156105b757600080fd5b803590602001918460018302840111640100000000831117156105d957600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f8201169050808301925050505050505091929192908035906020019064010000000081111561063c57600080fd5b82018360208201111561064e57600080fd5b8035906020019184600183028401116401000000008311171561067057600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050611248565b005b610814600480360360408110156106da57600080fd5b81019080803590602001906401000000008111156106f757600080fd5b82018360208201111561070957600080fd5b8035906020019184600183028401116401000000008311171561072b57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f8201169050808301925050505050505091929192908035906020019064010000000081111561078e57600080fd5b8201836020820111156107a057600080fd5b803590602001918460018302840111640100000000831117156107c257600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f8201169050808301925050505050505091929192905050506115bb565b005b6108fa600480360360a081101561082c57600080fd5b8101908080359060200190929190803560ff16906020019092919080359060200190929190803590602001909291908035906020019064010000000081111561087457600080fd5b82018360208201111561088657600080fd5b803590602001918460018302840111640100000000831117156108a857600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050611871565b604051808273ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b6109df6004803603602081101561093c57600080fd5b810190808035906020019064010000000081111561095957600080fd5b82018360208201111561096b57600080fd5b8035906020019184600183028401116401000000008311171561098d57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050611963565b6040518082815260200191505060405180910390f35b6000610a048686868686611871565b9050600073ffffffffffffffffffffffffffffffffffffffff168173ffffffffffffffffffffffffffffffffffffffff1614610c1357600080836040518082805190602001908083835b60208310610a715780518252602082019150602081019050602083039250610a4e565b6001836020036101000a03801982511681845116808217855250505050505090500191505090815260200160405180910390209050600073ffffffffffffffffffffffffffffffffffffffff168160000160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614610b0357600080fd5b60405180604001604052808373ffffffffffffffffffffffffffffffffffffffff168152602001604051806020016040528060008152508152506000846040518082805190602001908083835b60208310610b735780518252602082019150602081019050602083039250610b50565b6001836020036101000a038019825116818451168082178552505050505050905001915050908152602001604051809103902060008201518160000160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506020820151816001019080519060200190610c0992919061198e565b5090505050610c81565b6040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260138152602001807f7369674164647265737320776173206e756c6c0000000000000000000000000081525060200191505060405180910390fd5b505050505050565b600080826040518082805190602001908083835b60208310610cc05780518252602082019150602081019050602083039250610c9d565b6001836020036101000a03801982511681845116808217855250505050505090500191505090815260200160405180910390209050600073ffffffffffffffffffffffffffffffffffffffff168160000160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614610d5257600080fd5b60405180604001604052803373ffffffffffffffffffffffffffffffffffffffff168152602001604051806020016040528060008152508152506000836040518082805190602001908083835b60208310610dc25780518252602082019150602081019050602083039250610d9f565b6001836020036101000a038019825116818451168082178552505050505050905001915050908152602001604051809103902060008201518160000160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506020820151816001019080519060200190610e5892919061198e565b509050505050565b60606000808351905060006020855181610e7657fe5b0490506000829050600060208481610e8a57fe5b061115610ea05781806001019250506020810190505b8067ffffffffffffffff81118015610eb757600080fd5b506040519080825280601f01601f191660200182016040528015610eea5781602001600182028036833780820191505090505b509450600060208601602088015b84831015610f1b5780518252602082019150602081019050600183019250610ef8565b505050600060208481610f2a57fe5b061115610f495760008360200190508086016020860151815284875250505b50505050919050565b6060600080836040518082805190602001908083835b60208310610f8b5780518252602082019150602081019050602083039250610f68565b6001836020036101000a03801982511681845116808217855250505050505090500191505090815260200160405180910390209050600073ffffffffffffffffffffffffffffffffffffffff168160000160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141561103157604051806020016040528060008152509150506110d2565b806001018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156110c95780601f1061109e576101008083540402835291602001916110c9565b820191906000526020600020905b8154815290600101906020018083116110ac57829003601f168201915b50505050509150505b919050565b606060005b60208160ff161080156111275750600060f81b838260ff16602081106110fe57fe5b1a60f81b7effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff191614155b156111395780806001019150506110dc565b60608160ff1667ffffffffffffffff8111801561115557600080fd5b506040519080825280601f01601f1916602001820160405280156111885781602001600182028036833780820191505090505b509050600091505b60208260ff161080156111db5750600060f81b848360ff16602081106111b257fe5b1a60f81b7effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff191614155b1561123e57838260ff16602081106111ef57fe5b1a60f81b818360ff168151811061120257fe5b60200101907effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916908160001a9053508180600101925050611190565b8092505050919050565b60006112578787878786611871565b9050600073ffffffffffffffffffffffffffffffffffffffff168173ffffffffffffffffffffffffffffffffffffffff161461154457611295611a0e565b6000846040518082805190602001908083835b602083106112cb57805182526020820191506020810190506020830392506112a8565b6001836020036101000a03801982511681845116808217855250505050505090500191505090815260200160405180910390206040518060400160405290816000820160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001600182018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156113f85780601f106113cd576101008083540402835291602001916113f8565b820191906000526020600020905b8154815290600101906020018083116113db57829003601f168201915b50505050508152505090508173ffffffffffffffffffffffffffffffffffffffff16816000015173ffffffffffffffffffffffffffffffffffffffff161461143f57600080fd5b6040518060400160405280826000015173ffffffffffffffffffffffffffffffffffffffff168152602001848152506000856040518082805190602001908083835b602083106114a45780518252602082019150602081019050602083039250611481565b6001836020036101000a038019825116818451168082178552505050505050905001915050908152602001604051809103902060008201518160000160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550602082015181600101908051906020019061153a92919061198e565b50905050506115b2565b6040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260138152602001807f7369674164647265737320776173206e756c6c0000000000000000000000000081525060200191505060405180910390fd5b50505050505050565b6115c3611a0e565b6000836040518082805190602001908083835b602083106115f957805182526020820191506020810190506020830392506115d6565b6001836020036101000a03801982511681845116808217855250505050505090500191505090815260200160405180910390206040518060400160405290816000820160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001600182018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156117265780601f106116fb57610100808354040283529160200191611726565b820191906000526020600020905b81548152906001019060200180831161170957829003601f168201915b50505050508152505090503373ffffffffffffffffffffffffffffffffffffffff16816000015173ffffffffffffffffffffffffffffffffffffffff161461176d57600080fd5b6040518060400160405280826000015173ffffffffffffffffffffffffffffffffffffffff168152602001838152506000846040518082805190602001908083835b602083106117d257805182526020820191506020810190506020830392506117af565b6001836020036101000a038019825116818451168082178552505050505050905001915050908152602001604051809103902060008201518160000160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550602082015181600101908051906020019061186892919061198e565b50905050505050565b600080828051906020012090508681146118f3576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260168152602001807f70726f6f6620646f6573206e6f7420657175616c20680000000000000000000081525060200191505060405180910390fd5b60018787878760405160008152602001604052604051808581526020018460ff1681526020018381526020018281526020019450505050506020604051602081039080840390855afa15801561194d573d6000803e3d6000fd5b5050506020604051035191505095945050505050565b60006060829050600081511415611980576000801b915050611989565b60208301519150505b919050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106119cf57805160ff19168380011785556119fd565b828001600101855582156119fd579182015b828111156119fc5782518255916020019190600101906119e1565b5b509050611a0a9190611a3e565b5090565b6040518060400160405280600073ffffffffffffffffffffffffffffffffffffffff168152602001606081525090565b5b80821115611a57576000816000905550600101611a3f565b509056fea2646970667358221220ed0b8b3d6044942a24822ad232ab11e9f1585f2c5c931ecdd4d2944ba7aedb6664736f6c634300060c0033"
        const val FUNC_BYTES32TOSTRING = "bytes32ToString"
        const val FUNC_BYTESTOSTRING = "bytesToString"
        const val FUNC_CLAIMUSERNAME = "claimUserName"
        const val FUNC_CLAIMUSERNAMEMETA = "claimUsernameMeta"
        const val FUNC_POSTFORUSER = "postForUser"
        const val FUNC_POSTLOCATION = "postLocation"
        const val FUNC_POSTLOCATIONMETA = "postLocationMeta"
        const val FUNC_STRINGTOBYTES32 = "stringToBytes32"
        const val FUNC_VERIFYMSG = "verifyMsg"
        @Deprecated("")
        fun load(contractAddress: String?, web3j: Web3j?, credentials: Credentials?, gasPrice: BigInteger?, gasLimit: BigInteger?): HelloCelo {
            return HelloCelo(contractAddress, web3j, credentials, gasPrice, gasLimit)
        }

        @Deprecated("")
        fun load(contractAddress: String?, web3j: Web3j?, transactionManager: TransactionManager?, gasPrice: BigInteger?, gasLimit: BigInteger?): HelloCelo {
            return HelloCelo(contractAddress, web3j, transactionManager, gasPrice, gasLimit)
        }

        fun load(contractAddress: String?, web3j: Web3j?, credentials: Credentials?, contractGasProvider: ContractGasProvider?): HelloCelo {
            return HelloCelo(contractAddress, web3j, credentials, contractGasProvider)
        }

        fun load(contractAddress: String?, web3j: Web3j?, transactionManager: TransactionManager?, contractGasProvider: ContractGasProvider?): HelloCelo {
            return HelloCelo(contractAddress, web3j, transactionManager, contractGasProvider)
        }

        fun deploy(web3j: Web3j?, credentials: Credentials?, contractGasProvider: ContractGasProvider?): RemoteCall<HelloCelo> {
            return deployRemoteCall(HelloCelo::class.java, web3j, credentials, contractGasProvider, BINARY, "")
        }

        @Deprecated("")
        fun deploy(web3j: Web3j?, credentials: Credentials?, gasPrice: BigInteger?, gasLimit: BigInteger?): RemoteCall<HelloCelo> {
            return deployRemoteCall(HelloCelo::class.java, web3j, credentials, gasPrice, gasLimit, BINARY, "")
        }

        fun deploy(web3j: Web3j?, transactionManager: TransactionManager?, contractGasProvider: ContractGasProvider?): RemoteCall<HelloCelo> {
            return deployRemoteCall(HelloCelo::class.java, web3j, transactionManager, contractGasProvider, BINARY, "")
        }

        @Deprecated("")
        fun deploy(web3j: Web3j?, transactionManager: TransactionManager?, gasPrice: BigInteger?, gasLimit: BigInteger?): RemoteCall<HelloCelo> {
            return deployRemoteCall(HelloCelo::class.java, web3j, transactionManager, gasPrice, gasLimit, BINARY, "")
        }
    }
}